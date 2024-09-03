#
# This file was derived from the 'Hello Michael' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Example Hello, Michael application for Yocto build."
SECTION = "moyapp-1"
DEPENDS = ""
LICENSE = "MIT"
<<<<<<< HEAD
LIC_FILES_CHKSUM = "file:///home/michael/MoySandbox/yocto/HelloMichaelApp/LICENSE;md5=bf2017716e15e4e6b8b9301f3cb5384c"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-${PV}:"

# SRCREV = "b32a474f8953b0ddca178a8f78f7ae214d0986bf"
# SRCREV = "3c501bf62019eb073dc3f75b44b66b8deacb8562"
SRCREV = "2fb43bb1bbb4f8617561d2893798068fca9fff7d"
SRC_URI = "file:///home/michael/MoySandbox/yocto/HelloMichaelApp/"

S = "${WORKDIR}/git"
=======
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf2017716e15e4e6b8b9301f3cb5384c"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# SRCREV = "b32a474f8953b0ddca178a8f78f7ae214d0986bf"
SRCREV = "3c501bf62019eb073dc3f75b44b66b8deacb8562"
SRC_URI = "git://github.com/michaelmoy/YoctoHelloMichaelApp.git;branch=main"

S = "${WORKDIR}/git"
# S = "/home/michael/MoySandbox/yocto/YoctoHelloMichaelApp"
>>>>>>> 6367112 (Original Art)


# Pass arguments to linker
TARGET_CC_ARCH += "${LDFLAGS}"

# Cross-compile source code
do_compile() {
<<<<<<< HEAD
    ${CC} -o hellomichael /home/michael/MoySandbox/yocto/HelloMichaelApp/HelloMichael.c
=======
    ${CC} -o hellomichael HelloMichael.c
>>>>>>> 6367112 (Original Art)
}

# Create /usr/bin in rootfs and copy program to it
do_install() {
    install -d ${D}${bindir}
    install -m 0755 hellomichael ${D}${bindir}
}




# #inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
# #PARALLEL_MAKE = ""
