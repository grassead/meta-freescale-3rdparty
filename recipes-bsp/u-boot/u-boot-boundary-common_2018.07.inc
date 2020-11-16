DESCRIPTION = "U-Boot for Boundary Devices boards"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

PV = "v2018.07+git${SRCPV}"

SRCREV = "1aeb1e847ef71f05254c7b16866f223dc51e4a4b"
SRCBRANCH = "boundary-v2018.07_lt8912"
SRC_URI = "git://github.com/grassead/u-boot-imx6.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
PACKAGE_ARCH = "${MACHINE_ARCH}"
