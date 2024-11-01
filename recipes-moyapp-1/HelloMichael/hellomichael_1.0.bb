#
# This file was derived from the 'Hello Michael' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Example Hello, Michael application for Yocto build."
SECTION = "moyapp-1"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file:///home/michael/MoySandbox/yocto/HelloMichaelApp/LICENSE;md5=bf2017716e15e4e6b8b9301f3cb5384c"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "db005e4c1ca12afc8c377f6e21948f0820c45bde"
SRC_URI = "file:///home/michael/MoySandbox/yocto/HelloMichaelApp/"

S = "${WORKDIR}/git"


# Pass arguments to linker
TARGET_CC_ARCH += "${LDFLAGS}"

# Cross-compile source code
do_compile() {
    ${CC} -o hellomichael /home/michael/MoySandbox/yocto/HelloMichaelApp/HelloMichael.c
}

# Create /usr/bin in rootfs and copy program to it
do_install() {
    install -d ${D}${bindir}
    install -m 0755 hellomichael ${D}${bindir}
}




# #inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
# #PARALLEL_MAKE = ""

