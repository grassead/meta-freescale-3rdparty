# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

SUMMARY = "Linux kernel for Boundary Devices boards"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

LINUX_VERSION = "5.4.70"

SRC_URI = "git://github.com/grassead/linux-imx6.git;branch=boundary-imx_5.4.x_2.1.0-lt8912_drm \
"

LOCALVERSION = "-2.1.0-ga+yocto"
SRCBRANCH = "boundary-imx_5.4.x_2.1.0-lt8912_drm"
SRCREV = "a888d215ea8c818c6d32dfe2b9b139f16ba89230"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(nitrogen6x|nitrogen6x-lite|nitrogen6sx|nitrogen7|nitrogen8m|nitrogen8mm|nitrogen8mn)"

KBUILD_DEFCONFIG ?= "boundary_defconfig"

S = "${WORKDIR}/git"
