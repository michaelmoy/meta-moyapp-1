#
# This file was derived from the 'Hello Michael' example recipe in the
# Yocto Project Development Manual.
#
# The Get From GitHUB build pattern and the Use the Local Repo pattern are shown.
# The build is set to get from github below
#



DESCRIPTION = "Example Hello, Michael application for Yocto build."
SECTION = "moyapp-1"
DEPENDS = ""
LICENSE = "MIT"
# LIC_FILES_CHKSUM = "file://${TOPDIR}/../../HelloMichaelApp/LICENSE;md5=bf2017716e15e4e6b8b9301f3cb5384c"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=bf2017716e15e4e6b8b9301f3cb5384c"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "db005e4c1ca12afc8c377f6e21948f0820c45bde"
# SRC_URI = "file://${TOPDIR}/../../HelloMichaelApp/"
SRC_URI = "git://github.com/michaelmoy/HelloMichaelApp.git;branch=main"

S = "${WORKDIR}/git"


# Pass arguments to linker
TARGET_CC_ARCH += "${LDFLAGS}"

# Cross-compile source code
do_compile() {
#    ${CC} -o hellomichael ${TOPDIR}/../../HelloMichaelApp/HelloMichael.c
    ${CC} -o hellomichael HelloMichael.c
}

# Create /usr/bin in rootfs and copy program to it
do_install() {
    install -d ${D}${bindir}
    install -m 0755 hellomichael ${D}${bindir}
}




# #inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
# #PARALLEL_MAKE = ""

