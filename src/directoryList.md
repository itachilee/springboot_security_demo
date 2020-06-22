``````
|-- undefined
    |-- main
    |   |-- java
    |   |   |-- com
    |   |       |-- reason
    |   |           |-- gsny
    |   |               |-- Main.java
    |   |               |-- ServletInitializer.java
    |   |               |-- api
    |   |               |   |-- AuthenticateApi.java
    |   |               |   |-- GprsApi.java
    |   |               |   |-- MetersApi.java
    |   |               |   |-- OrderApi.java
    |   |               |   |-- TreeApi.java
    |   |               |   |-- bg
    |   |               |       |-- BgAreaDeviceApi.java
    |   |               |       |-- BgAreaMeterApi.java
    |   |               |       |-- BgAreaUserApi.java
    |   |               |       |-- BgAreaWaterUsageApi.java
    |   |               |       |-- BgAreaWaterUsageTimeApi.java
    |   |               |       |-- BgWaterWastedApi.java
    |   |               |-- config
    |   |               |   |-- GlobalCorsConfig.java
    |   |               |   |-- JacksonConfig.java
    |   |               |   |-- SecurityConfig.java
    |   |               |   |-- StaticResourceConfiguration.java
    |   |               |   |-- Swagger2.java
    |   |               |-- controller
    |   |               |   |-- BookController.java
    |   |               |   |-- ErrorController.java
    |   |               |   |-- GprsController.java
    |   |               |   |-- IndexController.java
    |   |               |   |-- LoginController.java
    |   |               |   |-- MainController.java
    |   |               |   |-- MeterController.java
    |   |               |   |-- OrderController.java
    |   |               |   |-- TreeController.java
    |   |               |   |-- UserController.java
    |   |               |-- debug
    |   |               |   |-- MyApplicationContext.java
    |   |               |-- entity
    |   |               |   |-- AbstractAuditable.java
    |   |               |   |-- SysPermission.java
    |   |               |   |-- SysRole.java
    |   |               |   |-- SysUser.java
    |   |               |   |-- TableBillEntity.java
    |   |               |   |-- TableBuildingEntity.java
    |   |               |   |-- TableChargeRecordEntity.java
    |   |               |   |-- TableChargesEntity.java
    |   |               |   |-- TableChargingModelEntity.java
    |   |               |   |-- TableCollectorEntity.java
    |   |               |   |-- TableColumnEntity.java
    |   |               |   |-- TableComunicateModeEntity.java
    |   |               |   |-- TableConditionEntity.java
    |   |               |   |-- TableDailyEntity.java
    |   |               |   |-- TableDirectionEntity.java
    |   |               |   |-- TableEntranceEntity.java
    |   |               |   |-- TableExchangStationEntity.java
    |   |               |   |-- TableFactoryNameEntity.java
    |   |               |   |-- TableFaultInfoEntity.java
    |   |               |   |-- TableGprsEntity.java
    |   |               |   |-- TableInStallDirectionEntity.java
    |   |               |   |-- TableInstallEnvironmentEntity.java
    |   |               |   |-- TableInstallModeEntity.java
    |   |               |   |-- TableLoginEntity.java
    |   |               |   |-- TableMeterAppraisalEntity.java
    |   |               |   |-- TableMeterEntity.java
    |   |               |   |-- TableNoticeEntity.java
    |   |               |   |-- TableOpenMeterRecordEntity.java
    |   |               |   |-- TableOperateLogEntity.java
    |   |               |   |-- TablePayEntity.java
    |   |               |   |-- TablePaymentRecordEntity.java
    |   |               |   |-- TableProductTypeEntity.java
    |   |               |   |-- TableReChargeEntity.java
    |   |               |   |-- TableReportEntity.java
    |   |               |   |-- TableSupplierEntity.java
    |   |               |   |-- TableToConcentratorEntity.java
    |   |               |   |-- TableUserAggInfoEntity.java
    |   |               |   |-- TableUserEntity.java
    |   |               |   |-- TableUserTypeEntity.java
    |   |               |   |-- TableVillageEntity.java
    |   |               |   |-- TableWaterEntity.java
    |   |               |   |-- TreeEntity.java
    |   |               |   |-- User.java
    |   |               |   |-- bg
    |   |               |   |   |-- BgAreaDevice.java
    |   |               |   |   |-- BgAreaMeter.java
    |   |               |   |   |-- BgAreaUser.java
    |   |               |   |   |-- BgAreaWaterUsage.java
    |   |               |   |   |-- BgAreaWaterUsageTime.java
    |   |               |   |   |-- BgWaterWasted.java
    |   |               |   |-- dto
    |   |               |   |   |-- AreaDeviceGroup.java
    |   |               |   |   |-- AreaDeviceGroup2.java
    |   |               |   |   |-- AreaMeter.java
    |   |               |   |   |-- AreaUserGroup.java
    |   |               |   |   |-- AreaWaterUsage.java
    |   |               |   |   |-- AreaWaterUsage2.java
    |   |               |   |   |-- AreaWaterUsage3.java
    |   |               |   |   |-- AreaWaterUsage4.java
    |   |               |   |   |-- AreaWaterWasted.java
    |   |               |   |-- jwt
    |   |               |   |   |-- AuthenticationRequest.java
    |   |               |   |   |-- AuthenticationResponse.java
    |   |               |   |-- other
    |   |               |       |-- Io.java
    |   |               |-- handler
    |   |               |   |-- JwtRequestFilter.java
    |   |               |-- repository
    |   |               |   |-- GprsRepo.java
    |   |               |   |-- MeterRepo.java
    |   |               |   |-- OrderRepo.java
    |   |               |   |-- TableMeterRepo.java
    |   |               |   |-- UserDao.java
    |   |               |   |-- WaterRepo.java
    |   |               |   |-- bg
    |   |               |   |   |-- BgAreaDeviceRepo.java
    |   |               |   |   |-- BgAreaMeterRepo.java
    |   |               |   |   |-- BgAreaUserRepo.java
    |   |               |   |   |-- BgAreaWaterUsageRepo.java
    |   |               |   |   |-- BgAreaWaterUsageTimeRepo.java
    |   |               |   |   |-- BgWaterWastedRepo.java
    |   |               |   |-- impl
    |   |               |       |-- SimpleJpaRepositoryImpl.java
    |   |               |-- service
    |   |               |   |-- GprsService.java
    |   |               |   |-- MetersService.java
    |   |               |   |-- OrderService.java
    |   |               |   |-- TableMeterService.java
    |   |               |   |-- UserService.java
    |   |               |   |-- bg
    |   |               |   |   |-- BgAreaDeviceService.java
    |   |               |   |   |-- BgAreaMeterService.java
    |   |               |   |   |-- BgAreaUserService.java
    |   |               |   |   |-- BgAreaWaterUsageService.java
    |   |               |   |   |-- BgWaterWastedService.java
    |   |               |   |-- impl
    |   |               |       |-- UserServiceImpl.java
    |   |               |-- support
    |   |               |   |-- MyUserDetailsService.java
    |   |               |-- util
    |   |                   |-- AesException.java
    |   |                   |-- ByteGroup.java
    |   |                   |-- ConfigUtil.java
    |   |                   |-- DoubleSerialize.java
    |   |                   |-- HttpUtil.java
    |   |                   |-- JwtUtil.java
    |   |                   |-- MD5Util.java
    |   |                   |-- PKCS7Encoder.java
    |   |                   |-- SHA1.java
    |   |                   |-- SignUtil.java
    |   |                   |-- SqlServer2008Dialect.java
    |   |                   |-- SQLServerNativeDialect.java
    |   |                   |-- StringUtils.java
    |   |                   |-- TradeNoUtil.java
    |   |                   |-- Util.java
    |   |                   |-- ValidataUtil.java
    |   |                   |-- WXBizMsgCrypt.java
    |   |                   |-- XMLParse.java
    |   |                   |-- XmlUtil.java
    |   |-- resources
    |       |-- application-dev.properties
    |       |-- application-prod.properties
    |       |-- application.yml
    |       |-- db
    |       |   |-- migration
    |       |-- public
    |       |   |-- a.txt
    |       |   |-- .idea
    |       |   |   |-- misc.xml
    |       |   |   |-- modules.xml
    |       |   |   |-- public.iml
    |       |   |   |-- vcs.xml
    |       |   |   |-- workspace.xml
    |       |   |   |-- inspectionProfiles
    |       |   |       |-- Project_Default.xml
    |       |   |-- build
    |       |       |-- asset-manifest.json
    |       |       |-- favicon.ico
    |       |       |-- index.html
    |       |       |-- logo192.png
    |       |       |-- logo512.png
    |       |       |-- manifest.json
    |       |       |-- precache-manifest.3eb6743fd3fc758d0e2bfe4d8d42d4b0.js
    |       |       |-- robots.txt
    |       |       |-- service-worker.js
    |       |       |-- static
    |       |           |-- css
    |       |           |   |-- 2.f9c694ef.chunk.css
    |       |           |   |-- 2.f9c694ef.chunk.css.map
    |       |           |   |-- main.5ecd60fb.chunk.css
    |       |           |   |-- main.5ecd60fb.chunk.css.map
    |       |           |-- js
    |       |               |-- 2.179a3ac9.chunk.js
    |       |               |-- 2.179a3ac9.chunk.js.LICENSE.txt
    |       |               |-- 2.179a3ac9.chunk.js.map
    |       |               |-- main.87d91849.chunk.js
    |       |               |-- main.87d91849.chunk.js.map
    |       |               |-- runtime-main.3aa28d22.js
    |       |               |-- runtime-main.3aa28d22.js.map
    |       |-- static
    |       |   |-- css
    |       |   |   |-- admin.css
    |       |   |   |-- aside.css
    |       |   |   |-- blog.css
    |       |   |   |-- bootstrap-grid.css
    |       |   |   |-- bootstrap-grid.css.map
    |       |   |   |-- bootstrap-grid.min.css
    |       |   |   |-- bootstrap-grid.min.css.map
    |       |   |   |-- bootstrap-reboot.css
    |       |   |   |-- bootstrap-reboot.css.map
    |       |   |   |-- bootstrap-reboot.min.css
    |       |   |   |-- bootstrap-reboot.min.css.map
    |       |   |   |-- bootstrap.css
    |       |   |   |-- bootstrap.css.map
    |       |   |   |-- bootstrap.min.css
    |       |   |   |-- bootstrap.min.css.map
    |       |   |   |-- bulma-divider.min.css
    |       |   |   |-- bulma.css
    |       |   |   |-- bulma.css.map
    |       |   |   |-- bulma.min.css
    |       |   |   |-- cards.css
    |       |   |   |-- cheatsheet.css
    |       |   |   |-- comon0.css
    |       |   |   |-- contact.css
    |       |   |   |-- forum.css
    |       |   |   |-- hero.css
    |       |   |   |-- inbox.css
    |       |   |   |-- index.css
    |       |   |   |-- instaAlbum.css
    |       |   |   |-- kanban.css
    |       |   |   |-- landing.css
    |       |   |   |-- login.css
    |       |   |   |-- personal.css
    |       |   |   |-- prism.css
    |       |   |   |-- showcase.css
    |       |   |   |-- tabs.css
    |       |   |-- images
    |       |   |   |-- admin.png
    |       |   |   |-- band.png
    |       |   |   |-- bg.jpg
    |       |   |   |-- blog.png
    |       |   |   |-- blog2.png
    |       |   |   |-- bulma.png
    |       |   |   |-- cards.png
    |       |   |   |-- cheatsheet.png
    |       |   |   |-- contact.png
    |       |   |   |-- cover.png
    |       |   |   |-- favicon.png
    |       |   |   |-- fav_icon.png
    |       |   |   |-- first-post.png
    |       |   |   |-- forum.png
    |       |   |   |-- head_bg.png
    |       |   |   |-- hero.png
    |       |   |   |-- inbox.png
    |       |   |   |-- instaalbum.png
    |       |   |   |-- kanban.png
    |       |   |   |-- kanban2.png
    |       |   |   |-- landing.png
    |       |   |   |-- loading.gif
    |       |   |   |-- login.png
    |       |   |   |-- modalcards.png
    |       |   |   |-- personal.png
    |       |   |   |-- showcase.png
    |       |   |   |-- tabs.png
    |       |   |-- js
    |       |   |   |-- bootstrap.bundle.js
    |       |   |   |-- bootstrap.bundle.js.map
    |       |   |   |-- bootstrap.bundle.min.js
    |       |   |   |-- bootstrap.bundle.min.js.map
    |       |   |   |-- bootstrap.js
    |       |   |   |-- bootstrap.js.map
    |       |   |   |-- bootstrap.min.js
    |       |   |   |-- bootstrap.min.js.map
    |       |   |   |-- bulma.js
    |       |   |   |-- echarts.min.js
    |       |   |   |-- jquery.cxselect.min.js
    |       |   |   |-- jquery.js
    |       |   |   |-- jquery.liMarquee.js
    |       |   |   |-- js.js
    |       |   |   |-- kanban-switch.js
    |       |   |   |-- kanban.js
    |       |   |   |-- showcase.js
    |       |   |   |-- tabs.js
    |       |   |-- jstree
    |       |       |-- .gitignore
    |       |       |-- bower.json
    |       |       |-- component.json
    |       |       |-- composer.json
    |       |       |-- gruntfile.js
    |       |       |-- jstree.jquery.json
    |       |       |-- LICENSE-MIT
    |       |       |-- package.json
    |       |       |-- README.md
    |       |       |-- demo
    |       |       |   |-- README.md
    |       |       |   |-- basic
    |       |       |       |-- index.html
    |       |       |       |-- root.json
    |       |       |-- dist
    |       |       |   |-- jstree.js
    |       |       |   |-- jstree.min.js
    |       |       |   |-- themes
    |       |       |       |-- default
    |       |       |       |   |-- 32px.png
    |       |       |       |   |-- 40px.png
    |       |       |       |   |-- style.css
    |       |       |       |   |-- style.min.css
    |       |       |       |   |-- throbber.gif
    |       |       |       |-- default-dark
    |       |       |           |-- 32px.png
    |       |       |           |-- 40px.png
    |       |       |           |-- style.css
    |       |       |           |-- style.min.css
    |       |       |           |-- throbber.gif
    |       |       |-- src
    |       |       |   |-- intro.js
    |       |       |   |-- jstree.changed.js
    |       |       |   |-- jstree.checkbox.js
    |       |       |   |-- jstree.conditionalselect.js
    |       |       |   |-- jstree.contextmenu.js
    |       |       |   |-- jstree.dnd.js
    |       |       |   |-- jstree.js
    |       |       |   |-- jstree.massload.js
    |       |       |   |-- jstree.search.js
    |       |       |   |-- jstree.sort.js
    |       |       |   |-- jstree.state.js
    |       |       |   |-- jstree.types.js
    |       |       |   |-- jstree.unique.js
    |       |       |   |-- jstree.wholerow.js
    |       |       |   |-- misc.js
    |       |       |   |-- outro.js
    |       |       |   |-- sample.js
    |       |       |   |-- vakata-jstree.js
    |       |       |   |-- themes
    |       |       |       |-- base.less
    |       |       |       |-- main.less
    |       |       |       |-- mixins.less
    |       |       |       |-- responsive.less
    |       |       |       |-- default
    |       |       |       |   |-- 32px.png
    |       |       |       |   |-- 40px.png
    |       |       |       |   |-- style.css
    |       |       |       |   |-- style.less
    |       |       |       |   |-- throbber.gif
    |       |       |       |-- default-dark
    |       |       |           |-- 32px.png
    |       |       |           |-- 40px.png
    |       |       |           |-- style.css
    |       |       |           |-- style.less
    |       |       |           |-- throbber.gif
    |       |       |-- test
    |       |           |-- unit
    |       |           |   |-- index.html
    |       |           |   |-- test.js
    |       |           |   |-- libs
    |       |           |       |-- qunit.css
    |       |           |       |-- qunit.js
    |       |           |-- visual
    |       |               |-- desktop
    |       |               |   |-- index.html
    |       |               |-- mobile
    |       |               |   |-- index.html
    |       |               |-- screenshots
    |       |                   |-- desktop
    |       |                   |   |-- .png
    |       |                   |   |-- desktop.png
    |       |                   |   |-- home.png
    |       |                   |-- mobile
    |       |                       |-- .png
    |       |                       |-- home.png
    |       |                       |-- mobile.png
    |       |-- templates
    |           |-- admin.html
    |           |-- cards.html
    |           |-- error.html
    |           |-- index.html
    |           |-- login.html
    |           |-- bg
    |           |   |-- index.html
    |           |-- book
    |           |   |-- detail.html
    |           |   |-- list.html
    |           |-- footer
    |           |   |-- footer.html
    |           |-- fragments
    |           |   |-- alert.html
    |           |   |-- footer.html
    |           |   |-- header.html
    |           |-- gprs
    |           |   |-- show.html
    |           |-- header
    |           |   |-- header.html
    |           |-- meters
    |           |   |-- show.html
    |           |-- order
    |           |   |-- show.html
    |           |-- tree
    |           |   |-- tree.html
    |           |-- upload
    |           |   |-- upload.html
    |           |-- user
    |               |-- index.html
    |               |-- list.html
    |               |-- userAdd.html
    |               |-- userEdit.html
    |-- test
        |-- java
            |-- com
                |-- reason
                    |-- gsny
                        |-- GsnyApplicationTests.java
