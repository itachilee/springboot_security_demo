安装mddir插件快速生成目录结构
npm install mddir -g
然后cd到项目目录
运行mddir即会在项目目录下生成directoryList.md文件
最后在目录的顶部天机"`````"字符，否则md显示后文件路径会杂糅在一块
``````
|-- undefined
    |-- .gitignore
    |-- gsnyBoot.iml
    |-- HELP.md
    |-- mvnw
    |-- mvnw.cmd
    |-- pom.xml
    |-- readme.md
    |-- version.md
    |-- .idea
    |   |-- .name
    |   |-- compiler.xml
    |   |-- dataSources.local.xml
    |   |-- dataSources.xml
    |   |-- encodings.xml
    |   |-- misc.xml
    |   |-- modules.xml
    |   |-- uiDesigner.xml
    |   |-- vcs.xml
    |   |-- workspace.xml
    |   |-- dataSources
    |   |   |-- 8ddb6066-39d0-4db5-b680-dc629c7f307a.xml
    |   |   |-- 8ddb6066-39d0-4db5-b680-dc629c7f307a
    |   |       |-- storage_v2
    |   |           |-- _src_
    |   |               |-- database
    |   |                   |-- top_test_new.HaTZrA.meta
    |   |                   |-- top_test_new.HaTZrA
    |   |                       |-- schema
    |   |                           |-- dbo.sYMBAA.meta
    |   |                           |-- dbo.sYMBAA.zip
    |   |                           |-- INFORMATION_SCHEMA.NBgcMw.meta
    |   |                           |-- sys.zb4BAA.meta
    |   |-- inspectionProfiles
    |   |   |-- Project_Default.xml
    |   |-- libraries
    |       |-- Maven__antlr_antlr_2_7_7.xml
    |       |-- Maven__aopalliance_aopalliance_1_0.xml
    |       |-- Maven__asm_asm_3_3_1.xml
    |       |-- Maven__ch_netzwerg_paleo_core_0_11_0.xml
    |       |-- Maven__ch_qos_logback_logback_classic_1_2_3.xml
    |       |-- Maven__ch_qos_logback_logback_core_1_2_3.xml
    |       |-- Maven__commons_beanutils_commons_beanutils_1_9_2.xml
    |       |-- Maven__commons_codec_commons_codec_1_11.xml
    |       |-- Maven__commons_collections_commons_collections_3_2_1.xml
    |       |-- Maven__commons_io_commons_io_1_3_2.xml
    |       |-- Maven__commons_logging_commons_logging_1_2.xml
    |       |-- Maven__com_alibaba_druid_1_1_10.xml
    |       |-- Maven__com_fasterxml_classmate_1_4_0.xml
    |       |-- Maven__com_fasterxml_jackson_core_jackson_annotations_2_9_0.xml
    |       |-- Maven__com_fasterxml_jackson_core_jackson_core_2_9_9.xml
    |       |-- Maven__com_fasterxml_jackson_core_jackson_databind_2_9_9.xml
    |       |-- Maven__com_fasterxml_jackson_dataformat_jackson_dataformat_yaml_2_9_9.xml
    |       |-- Maven__com_fasterxml_jackson_datatype_jackson_datatype_jdk8_2_9_9.xml
    |       |-- Maven__com_fasterxml_jackson_datatype_jackson_datatype_jsr310_2_9_9.xml
    |       |-- Maven__com_fasterxml_jackson_module_jackson_module_parameter_names_2_9_9.xml
    |       |-- Maven__com_github_eirslett_frontend_maven_plugin_1_6.xml
    |       |-- Maven__com_github_eirslett_frontend_plugin_core_1_6.xml
    |       |-- Maven__com_github_fge_btf_1_2.xml
    |       |-- Maven__com_github_fge_jackson_coreutils_1_6.xml
    |       |-- Maven__com_github_fge_json_patch_1_6.xml
    |       |-- Maven__com_github_fge_msg_simple_1_1.xml
    |       |-- Maven__com_github_fge_uri_template_0_9.xml
    |       |-- Maven__com_github_java_json_tools_json_schema_core_1_2_8.xml
    |       |-- Maven__com_github_java_json_tools_json_schema_validator_2_2_8.xml
    |       |-- Maven__com_googlecode_libphonenumber_libphonenumber_8_0_0.xml
    |       |-- Maven__com_google_code_findbugs_jsr305_3_0_1.xml
    |       |-- Maven__com_google_guava_guava_20_0.xml
    |       |-- Maven__com_jayway_jsonpath_json_path_2_4_0.xml
    |       |-- Maven__com_microsoft_sqlserver_mssql_jdbc_6_4_0_jre8.xml
    |       |-- Maven__com_vaadin_external_google_android_json_0_0_20131108_vaadin1.xml
    |       |-- Maven__com_zaxxer_HikariCP_3_2_0.xml
    |       |-- Maven__io_github_swagger2markup_markup_document_builder_1_1_2.xml
    |       |-- Maven__io_github_swagger2markup_swagger2markup_1_3_3.xml
    |       |-- Maven__io_jsonwebtoken_jjwt_0_9_1.xml
    |       |-- Maven__io_springfox_springfox_core_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_schema_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_spi_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_spring_web_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_swagger2_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_swagger_common_2_9_2.xml
    |       |-- Maven__io_springfox_springfox_swagger_ui_2_9_2.xml
    |       |-- Maven__io_swagger_swagger_annotations_1_5_20.xml
    |       |-- Maven__io_swagger_swagger_compat_spec_parser_1_0_35.xml
    |       |-- Maven__io_swagger_swagger_core_1_5_19.xml
    |       |-- Maven__io_swagger_swagger_models_1_5_20.xml
    |       |-- Maven__io_swagger_swagger_parser_1_0_35.xml
    |       |-- Maven__io_vavr_vavr_0_9_1.xml
    |       |-- Maven__io_vavr_vavr_match_0_9_1.xml
    |       |-- Maven__javax_activation_activation_1_1.xml
    |       |-- Maven__javax_activation_javax_activation_api_1_2_0.xml
    |       |-- Maven__javax_annotation_javax_annotation_api_1_3_2.xml
    |       |-- Maven__javax_annotation_jsr250_api_1_0.xml
    |       |-- Maven__javax_enterprise_cdi_api_1_0.xml
    |       |-- Maven__javax_inject_javax_inject_1.xml
    |       |-- Maven__javax_mail_mailapi_1_4_3.xml
    |       |-- Maven__javax_persistence_javax_persistence_api_2_2.xml
    |       |-- Maven__javax_transaction_javax_transaction_api_1_3.xml
    |       |-- Maven__javax_validation_validation_api_2_0_1_Final.xml
    |       |-- Maven__javax_xml_bind_jaxb_api_2_3_0.xml
    |       |-- Maven__joda_time_joda_time_2_10_2.xml
    |       |-- Maven__junit_junit_4_12.xml
    |       |-- Maven__log4j_log4j_1_2_17.xml
    |       |-- Maven__net_bytebuddy_byte_buddy_1_9_13.xml
    |       |-- Maven__net_bytebuddy_byte_buddy_agent_1_9_13.xml
    |       |-- Maven__net_minidev_accessors_smart_1_2.xml
    |       |-- Maven__net_minidev_json_smart_2_3.xml
    |       |-- Maven__net_sf_ehcache_ehcache_core_2_6_11.xml
    |       |-- Maven__net_sf_jopt_simple_jopt_simple_5_0_3.xml
    |       |-- Maven__net_sourceforge_nekohtml_nekohtml_1_9_22.xml
    |       |-- Maven__nl_jworks_markdown_to_asciidoc_markdown_to_asciidoc_1_0.xml
    |       |-- Maven__org_apache_commons_commons_collections4_4_1.xml
    |       |-- Maven__org_apache_commons_commons_compress_1_5.xml
    |       |-- Maven__org_apache_commons_commons_configuration2_2_1.xml
    |       |-- Maven__org_apache_commons_commons_exec_1_3.xml
    |       |-- Maven__org_apache_commons_commons_lang3_3_8_1.xml
    |       |-- Maven__org_apache_httpcomponents_httpclient_4_5_2.xml
    |       |-- Maven__org_apache_httpcomponents_httpcore_4_4_5.xml
    |       |-- Maven__org_apache_httpcomponents_httpmime_4_3_1.xml
    |       |-- Maven__org_apache_logging_log4j_log4j_api_2_11_2.xml
    |       |-- Maven__org_apache_logging_log4j_log4j_core_2_11_1.xml
    |       |-- Maven__org_apache_logging_log4j_log4j_to_slf4j_2_11_2.xml
    |       |-- Maven__org_apache_maven_maven_artifact_3_1_0.xml
    |       |-- Maven__org_apache_maven_maven_model_3_1_0.xml
    |       |-- Maven__org_apache_maven_maven_plugin_api_3_1_0.xml
    |       |-- Maven__org_apache_maven_plugin_tools_maven_plugin_annotations_3_2.xml
    |       |-- Maven__org_apache_shiro_shiro_cache_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_config_core_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_config_ogdl_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_core_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_crypto_cipher_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_crypto_core_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_crypto_hash_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_ehcache_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_event_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_lang_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_spring_1_4_0.xml
    |       |-- Maven__org_apache_shiro_shiro_web_1_4_0.xml
    |       |-- Maven__org_apache_tomcat_embed_tomcat_embed_core_9_0_21.xml
    |       |-- Maven__org_apache_tomcat_embed_tomcat_embed_el_9_0_21.xml
    |       |-- Maven__org_apache_tomcat_embed_tomcat_embed_websocket_9_0_21.xml
    |       |-- Maven__org_apiguardian_apiguardian_api_1_0_0.xml
    |       |-- Maven__org_aspectj_aspectjweaver_1_9_4.xml
    |       |-- Maven__org_assertj_assertj_core_3_11_1.xml
    |       |-- Maven__org_attoparser_attoparser_2_0_5_RELEASE.xml
    |       |-- Maven__org_codehaus_jackson_jackson_core_asl_1_9_13.xml
    |       |-- Maven__org_codehaus_jackson_jackson_mapper_asl_1_9_13.xml
    |       |-- Maven__org_codehaus_plexus_plexus_classworlds_2_4.xml
    |       |-- Maven__org_codehaus_plexus_plexus_component_annotations_1_5_5.xml
    |       |-- Maven__org_codehaus_plexus_plexus_utils_3_0_22.xml
    |       |-- Maven__org_dom4j_dom4j_2_1_1.xml
    |       |-- Maven__org_eclipse_sisu_org_eclipse_sisu_inject_0_0_0_M2a.xml
    |       |-- Maven__org_eclipse_sisu_org_eclipse_sisu_plexus_0_0_0_M2a.xml
    |       |-- Maven__org_hamcrest_hamcrest_core_1_3.xml
    |       |-- Maven__org_hamcrest_hamcrest_library_1_3.xml
    |       |-- Maven__org_hibernate_common_hibernate_commons_annotations_5_0_4_Final.xml
    |       |-- Maven__org_hibernate_hibernate_core_5_3_10_Final.xml
    |       |-- Maven__org_hibernate_validator_hibernate_validator_6_0_17_Final.xml
    |       |-- Maven__org_javassist_javassist_3_23_2_GA.xml
    |       |-- Maven__org_jboss_jandex_2_0_5_Final.xml
    |       |-- Maven__org_jboss_logging_jboss_logging_3_3_2_Final.xml
    |       |-- Maven__org_jsoup_jsoup_1_8_1.xml
    |       |-- Maven__org_junit_jupiter_junit_jupiter_5_7_0_M1.xml
    |       |-- Maven__org_junit_jupiter_junit_jupiter_api_5_3_2.xml
    |       |-- Maven__org_junit_jupiter_junit_jupiter_engine_5_3_2.xml
    |       |-- Maven__org_junit_jupiter_junit_jupiter_params_5_3_2.xml
    |       |-- Maven__org_junit_platform_junit_platform_commons_1_3_2.xml
    |       |-- Maven__org_junit_platform_junit_platform_engine_1_3_2.xml
    |       |-- Maven__org_mapstruct_mapstruct_1_2_0_Final.xml
    |       |-- Maven__org_mockito_mockito_core_2_23_4.xml
    |       |-- Maven__org_mozilla_rhino_1_7R4.xml
    |       |-- Maven__org_objenesis_objenesis_2_6.xml
    |       |-- Maven__org_opentest4j_opentest4j_1_1_1.xml
    |       |-- Maven__org_ow2_asm_asm_5_0_4.xml
    |       |-- Maven__org_ow2_asm_asm_analysis_4_1.xml
    |       |-- Maven__org_ow2_asm_asm_tree_4_1.xml
    |       |-- Maven__org_ow2_asm_asm_util_4_1.xml
    |       |-- Maven__org_parboiled_parboiled_core_1_1_6.xml
    |       |-- Maven__org_parboiled_parboiled_java_1_1_6.xml
    |       |-- Maven__org_pegdown_pegdown_1_4_2.xml
    |       |-- Maven__org_projectlombok_lombok_1_16_18.xml
    |       |-- Maven__org_skyscreamer_jsonassert_1_5_0.xml
    |       |-- Maven__org_slf4j_jul_to_slf4j_1_7_26.xml
    |       |-- Maven__org_slf4j_slf4j_api_1_7_26.xml
    |       |-- Maven__org_slf4j_slf4j_ext_1_7_26.xml
    |       |-- Maven__org_sonatype_plexus_plexus_build_api_0_0_7.xml
    |       |-- Maven__org_sonatype_sisu_sisu_guice_no_aop_3_1_0.xml
    |       |-- Maven__org_springframework_boot_spring_boot_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_autoconfigure_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_devtools_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_aop_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_data_jpa_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_jdbc_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_json_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_logging_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_security_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_test_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_thymeleaf_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_tomcat_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_starter_web_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_test_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_boot_spring_boot_test_autoconfigure_2_1_6_RELEASE.xml
    |       |-- Maven__org_springframework_data_spring_data_commons_2_1_9_RELEASE.xml
    |       |-- Maven__org_springframework_data_spring_data_jpa_2_1_9_RELEASE.xml
    |       |-- Maven__org_springframework_plugin_spring_plugin_core_1_2_0_RELEASE.xml
    |       |-- Maven__org_springframework_plugin_spring_plugin_metadata_1_2_0_RELEASE.xml
    |       |-- Maven__org_springframework_security_spring_security_config_5_1_5_RELEASE.xml
    |       |-- Maven__org_springframework_security_spring_security_core_5_1_5_RELEASE.xml
    |       |-- Maven__org_springframework_security_spring_security_web_5_1_5_RELEASE.xml
    |       |-- Maven__org_springframework_spring_aop_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_aspects_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_beans_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_context_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_core_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_expression_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_jcl_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_jdbc_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_orm_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_test_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_tx_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_webmvc_5_1_8_RELEASE.xml
    |       |-- Maven__org_springframework_spring_web_5_1_8_RELEASE.xml
    |       |-- Maven__org_thymeleaf_extras_thymeleaf_extras_java8time_3_0_4_RELEASE.xml
    |       |-- Maven__org_thymeleaf_extras_thymeleaf_extras_springsecurity5_3_0_4_RELEASE.xml
    |       |-- Maven__org_thymeleaf_thymeleaf_3_0_11_RELEASE.xml
    |       |-- Maven__org_thymeleaf_thymeleaf_spring5_3_0_11_RELEASE.xml
    |       |-- Maven__org_tukaani_xz_1_2.xml
    |       |-- Maven__org_unbescape_unbescape_1_1_6_RELEASE.xml
    |       |-- Maven__org_xmlunit_xmlunit_core_2_6_2.xml
    |       |-- Maven__org_yaml_snakeyaml_1_23.xml
    |       |-- Maven__xerces_xercesImpl_2_11_0.xml
    |       |-- Maven__xml_apis_xml_apis_1_4_01.xml
    |-- .mvn
    |   |-- wrapper
    |       |-- maven-wrapper.jar
    |       |-- maven-wrapper.properties
    |       |-- MavenWrapperDownloader.java
    |-- docs
    |   |-- markdown
    |       |-- generated
    |           |-- definitions.md
    |           |-- overview.md
    |           |-- paths.md
    |           |-- security.md
    |-- META-INF
    |   |-- orm.xml
    |   |-- upload.jsp
    |-- src
    |   |-- main
    |   |   |-- java
    |   |   |   |-- com
    |   |   |       |-- reason
    |   |   |           |-- gsny
    |   |   |               |-- Main.java
    |   |   |               |-- ServletInitializer.java
    |   |   |               |-- api
    |   |   |               |   |-- AuthenticateApi.java
    |   |   |               |   |-- GprsApi.java
    |   |   |               |   |-- MetersApi.java
    |   |   |               |   |-- OrderApi.java
    |   |   |               |   |-- TreeApi.java
    |   |   |               |   |-- bg
    |   |   |               |       |-- BgAreaDeviceApi.java
    |   |   |               |       |-- BgAreaUserApi.java
    |   |   |               |       |-- BgAreaWaterUsageApi.java
    |   |   |               |       |-- BgAreaWaterUsageTimeApi.java
    |   |   |               |-- config
    |   |   |               |   |-- GlobalCorsConfig.java
    |   |   |               |   |-- JacksonConfig.java
    |   |   |               |   |-- SecurityConfig.java
    |   |   |               |   |-- StaticResourceConfiguration.java
    |   |   |               |   |-- Swagger2.java
    |   |   |               |-- controller
    |   |   |               |   |-- BookController.java
    |   |   |               |   |-- ErrorController.java
    |   |   |               |   |-- GprsController.java
    |   |   |               |   |-- IndexController.java
    |   |   |               |   |-- LoginController.java
    |   |   |               |   |-- MainController.java
    |   |   |               |   |-- MeterController.java
    |   |   |               |   |-- OrderController.java
    |   |   |               |   |-- TreeController.java
    |   |   |               |   |-- UserController.java
    |   |   |               |-- debug
    |   |   |               |   |-- MyApplicationContext.java
    |   |   |               |-- entity
    |   |   |               |   |-- AbstractAuditable.java
    |   |   |               |   |-- SysPermission.java
    |   |   |               |   |-- SysRole.java
    |   |   |               |   |-- SysUser.java
    |   |   |               |   |-- TableBillEntity.java
    |   |   |               |   |-- TableBuildingEntity.java
    |   |   |               |   |-- TableChargeRecordEntity.java
    |   |   |               |   |-- TableChargesEntity.java
    |   |   |               |   |-- TableChargingModelEntity.java
    |   |   |               |   |-- TableCollectorEntity.java
    |   |   |               |   |-- TableColumnEntity.java
    |   |   |               |   |-- TableComunicateModeEntity.java
    |   |   |               |   |-- TableConditionEntity.java
    |   |   |               |   |-- TableDailyEntity.java
    |   |   |               |   |-- TableDirectionEntity.java
    |   |   |               |   |-- TableEntranceEntity.java
    |   |   |               |   |-- TableExchangStationEntity.java
    |   |   |               |   |-- TableFactoryNameEntity.java
    |   |   |               |   |-- TableFaultInfoEntity.java
    |   |   |               |   |-- TableGprsEntity.java
    |   |   |               |   |-- TableInStallDirectionEntity.java
    |   |   |               |   |-- TableInstallEnvironmentEntity.java
    |   |   |               |   |-- TableInstallModeEntity.java
    |   |   |               |   |-- TableLoginEntity.java
    |   |   |               |   |-- TableMeterAppraisalEntity.java
    |   |   |               |   |-- TableMeterEntity.java
    |   |   |               |   |-- TableNoticeEntity.java
    |   |   |               |   |-- TableOpenMeterRecordEntity.java
    |   |   |               |   |-- TableOperateLogEntity.java
    |   |   |               |   |-- TablePayEntity.java
    |   |   |               |   |-- TablePaymentRecordEntity.java
    |   |   |               |   |-- TableProductTypeEntity.java
    |   |   |               |   |-- TableReChargeEntity.java
    |   |   |               |   |-- TableReportEntity.java
    |   |   |               |   |-- TableSupplierEntity.java
    |   |   |               |   |-- TableToConcentratorEntity.java
    |   |   |               |   |-- TableUserAggInfoEntity.java
    |   |   |               |   |-- TableUserEntity.java
    |   |   |               |   |-- TableUserTypeEntity.java
    |   |   |               |   |-- TableVillageEntity.java
    |   |   |               |   |-- TableWaterEntity.java
    |   |   |               |   |-- TreeEntity.java
    |   |   |               |   |-- User.java
    |   |   |               |   |-- bg
    |   |   |               |   |   |-- BgAreaDevice.java
    |   |   |               |   |   |-- BgAreaUser.java
    |   |   |               |   |   |-- BgAreaWaterUsage.java
    |   |   |               |   |   |-- BgAreaWaterUsageTime.java
    |   |   |               |   |-- dto
    |   |   |               |   |   |-- AreaDeviceGroup.java
    |   |   |               |   |   |-- AreaUserGroup.java
    |   |   |               |   |   |-- AreaWaterUsage.java
    |   |   |               |   |-- jwt
    |   |   |               |   |   |-- AuthenticationRequest.java
    |   |   |               |   |   |-- AuthenticationResponse.java
    |   |   |               |   |-- other
    |   |   |               |       |-- Io.java
    |   |   |               |-- handler
    |   |   |               |   |-- JwtRequestFilter.java
    |   |   |               |-- repository
    |   |   |               |   |-- GprsRepo.java
    |   |   |               |   |-- MeterRepo.java
    |   |   |               |   |-- OrderRepo.java
    |   |   |               |   |-- TableMeterRepo.java
    |   |   |               |   |-- UserDao.java
    |   |   |               |   |-- WaterRepo.java
    |   |   |               |   |-- bg
    |   |   |               |   |   |-- BgAreaDeviceRepo.java
    |   |   |               |   |   |-- BgAreaUserRepo.java
    |   |   |               |   |   |-- BgAreaWaterUsageRepo.java
    |   |   |               |   |   |-- BgAreaWaterUsageTimeRepo.java
    |   |   |               |   |-- impl
    |   |   |               |       |-- SimpleJpaRepositoryImpl.java
    |   |   |               |-- service
    |   |   |               |   |-- GprsService.java
    |   |   |               |   |-- MetersService.java
    |   |   |               |   |-- OrderService.java
    |   |   |               |   |-- TableMeterService.java
    |   |   |               |   |-- UserService.java
    |   |   |               |   |-- bg
    |   |   |               |   |   |-- BgAreaDeviceService.java
    |   |   |               |   |   |-- BgAreaUserService.java
    |   |   |               |   |-- impl
    |   |   |               |       |-- UserServiceImpl.java
    |   |   |               |-- support
    |   |   |               |   |-- MyUserDetailsService.java
    |   |   |               |-- util
    |   |   |                   |-- AesException.java
    |   |   |                   |-- ByteGroup.java
    |   |   |                   |-- ConfigUtil.java
    |   |   |                   |-- HttpUtil.java
    |   |   |                   |-- JwtUtil.java
    |   |   |                   |-- MD5Util.java
    |   |   |                   |-- PKCS7Encoder.java
    |   |   |                   |-- SHA1.java
    |   |   |                   |-- SignUtil.java
    |   |   |                   |-- SqlServer2008Dialect.java
    |   |   |                   |-- SQLServerNativeDialect.java
    |   |   |                   |-- StringUtils.java
    |   |   |                   |-- TradeNoUtil.java
    |   |   |                   |-- Util.java
    |   |   |                   |-- ValidataUtil.java
    |   |   |                   |-- WXBizMsgCrypt.java
    |   |   |                   |-- XMLParse.java
    |   |   |                   |-- XmlUtil.java
    |   |   |-- resources
    |   |       |-- application-dev.properties
    |   |       |-- application-prod.properties
    |   |       |-- application.yml
    |   |       |-- db
    |   |       |   |-- migration
    |   |       |-- public
    |   |       |   |-- a.txt
    |   |       |   |-- .idea
    |   |       |   |   |-- misc.xml
    |   |       |   |   |-- modules.xml
    |   |       |   |   |-- public.iml
    |   |       |   |   |-- vcs.xml
    |   |       |   |   |-- workspace.xml
    |   |       |   |   |-- inspectionProfiles
    |   |       |   |       |-- Project_Default.xml
    |   |       |   |-- build
    |   |       |       |-- asset-manifest.json
    |   |       |       |-- favicon.ico
    |   |       |       |-- index.html
    |   |       |       |-- logo192.png
    |   |       |       |-- logo512.png
    |   |       |       |-- manifest.json
    |   |       |       |-- precache-manifest.3eb6743fd3fc758d0e2bfe4d8d42d4b0.js
    |   |       |       |-- robots.txt
    |   |       |       |-- service-worker.js
    |   |       |       |-- static
    |   |       |           |-- css
    |   |       |           |   |-- 2.f9c694ef.chunk.css
    |   |       |           |   |-- 2.f9c694ef.chunk.css.map
    |   |       |           |   |-- main.5ecd60fb.chunk.css
    |   |       |           |   |-- main.5ecd60fb.chunk.css.map
    |   |       |           |-- js
    |   |       |               |-- 2.179a3ac9.chunk.js
    |   |       |               |-- 2.179a3ac9.chunk.js.LICENSE.txt
    |   |       |               |-- 2.179a3ac9.chunk.js.map
    |   |       |               |-- main.87d91849.chunk.js
    |   |       |               |-- main.87d91849.chunk.js.map
    |   |       |               |-- runtime-main.3aa28d22.js
    |   |       |               |-- runtime-main.3aa28d22.js.map
    |   |       |-- static
    |   |       |   |-- css
    |   |       |   |   |-- admin.css
    |   |       |   |   |-- aside.css
    |   |       |   |   |-- blog.css
    |   |       |   |   |-- bootstrap-grid.css
    |   |       |   |   |-- bootstrap-grid.css.map
    |   |       |   |   |-- bootstrap-grid.min.css
    |   |       |   |   |-- bootstrap-grid.min.css.map
    |   |       |   |   |-- bootstrap-reboot.css
    |   |       |   |   |-- bootstrap-reboot.css.map
    |   |       |   |   |-- bootstrap-reboot.min.css
    |   |       |   |   |-- bootstrap-reboot.min.css.map
    |   |       |   |   |-- bootstrap.css
    |   |       |   |   |-- bootstrap.css.map
    |   |       |   |   |-- bootstrap.min.css
    |   |       |   |   |-- bootstrap.min.css.map
    |   |       |   |   |-- bulma-divider.min.css
    |   |       |   |   |-- bulma.css
    |   |       |   |   |-- bulma.css.map
    |   |       |   |   |-- bulma.min.css
    |   |       |   |   |-- cards.css
    |   |       |   |   |-- cheatsheet.css
    |   |       |   |   |-- comon0.css
    |   |       |   |   |-- contact.css
    |   |       |   |   |-- forum.css
    |   |       |   |   |-- hero.css
    |   |       |   |   |-- inbox.css
    |   |       |   |   |-- index.css
    |   |       |   |   |-- instaAlbum.css
    |   |       |   |   |-- kanban.css
    |   |       |   |   |-- landing.css
    |   |       |   |   |-- login.css
    |   |       |   |   |-- personal.css
    |   |       |   |   |-- prism.css
    |   |       |   |   |-- showcase.css
    |   |       |   |   |-- tabs.css
    |   |       |   |-- images
    |   |       |   |   |-- admin.png
    |   |       |   |   |-- band.png
    |   |       |   |   |-- bg.jpg
    |   |       |   |   |-- blog.png
    |   |       |   |   |-- blog2.png
    |   |       |   |   |-- bulma.png
    |   |       |   |   |-- cards.png
    |   |       |   |   |-- cheatsheet.png
    |   |       |   |   |-- contact.png
    |   |       |   |   |-- cover.png
    |   |       |   |   |-- favicon.png
    |   |       |   |   |-- fav_icon.png
    |   |       |   |   |-- first-post.png
    |   |       |   |   |-- forum.png
    |   |       |   |   |-- head_bg.png
    |   |       |   |   |-- hero.png
    |   |       |   |   |-- inbox.png
    |   |       |   |   |-- instaalbum.png
    |   |       |   |   |-- kanban.png
    |   |       |   |   |-- kanban2.png
    |   |       |   |   |-- landing.png
    |   |       |   |   |-- loading.gif
    |   |       |   |   |-- login.png
    |   |       |   |   |-- modalcards.png
    |   |       |   |   |-- personal.png
    |   |       |   |   |-- showcase.png
    |   |       |   |   |-- tabs.png
    |   |       |   |-- js
    |   |       |   |   |-- bootstrap.bundle.js
    |   |       |   |   |-- bootstrap.bundle.js.map
    |   |       |   |   |-- bootstrap.bundle.min.js
    |   |       |   |   |-- bootstrap.bundle.min.js.map
    |   |       |   |   |-- bootstrap.js
    |   |       |   |   |-- bootstrap.js.map
    |   |       |   |   |-- bootstrap.min.js
    |   |       |   |   |-- bootstrap.min.js.map
    |   |       |   |   |-- bulma.js
    |   |       |   |   |-- echarts.min.js
    |   |       |   |   |-- jquery.cxselect.min.js
    |   |       |   |   |-- jquery.js
    |   |       |   |   |-- jquery.liMarquee.js
    |   |       |   |   |-- js.js
    |   |       |   |   |-- kanban-switch.js
    |   |       |   |   |-- kanban.js
    |   |       |   |   |-- showcase.js
    |   |       |   |   |-- tabs.js
    |   |       |   |-- jstree
    |   |       |       |-- .gitignore
    |   |       |       |-- bower.json
    |   |       |       |-- component.json
    |   |       |       |-- composer.json
    |   |       |       |-- gruntfile.js
    |   |       |       |-- jstree.jquery.json
    |   |       |       |-- LICENSE-MIT
    |   |       |       |-- package.json
    |   |       |       |-- README.md
    |   |       |       |-- demo
    |   |       |       |   |-- README.md
    |   |       |       |   |-- basic
    |   |       |       |       |-- index.html
    |   |       |       |       |-- root.json
    |   |       |       |-- dist
    |   |       |       |   |-- jstree.js
    |   |       |       |   |-- jstree.min.js
    |   |       |       |   |-- themes
    |   |       |       |       |-- default
    |   |       |       |       |   |-- 32px.png
    |   |       |       |       |   |-- 40px.png
    |   |       |       |       |   |-- style.css
    |   |       |       |       |   |-- style.min.css
    |   |       |       |       |   |-- throbber.gif
    |   |       |       |       |-- default-dark
    |   |       |       |           |-- 32px.png
    |   |       |       |           |-- 40px.png
    |   |       |       |           |-- style.css
    |   |       |       |           |-- style.min.css
    |   |       |       |           |-- throbber.gif
    |   |       |       |-- src
    |   |       |       |   |-- intro.js
    |   |       |       |   |-- jstree.changed.js
    |   |       |       |   |-- jstree.checkbox.js
    |   |       |       |   |-- jstree.conditionalselect.js
    |   |       |       |   |-- jstree.contextmenu.js
    |   |       |       |   |-- jstree.dnd.js
    |   |       |       |   |-- jstree.js
    |   |       |       |   |-- jstree.massload.js
    |   |       |       |   |-- jstree.search.js
    |   |       |       |   |-- jstree.sort.js
    |   |       |       |   |-- jstree.state.js
    |   |       |       |   |-- jstree.types.js
    |   |       |       |   |-- jstree.unique.js
    |   |       |       |   |-- jstree.wholerow.js
    |   |       |       |   |-- misc.js
    |   |       |       |   |-- outro.js
    |   |       |       |   |-- sample.js
    |   |       |       |   |-- vakata-jstree.js
    |   |       |       |   |-- themes
    |   |       |       |       |-- base.less
    |   |       |       |       |-- main.less
    |   |       |       |       |-- mixins.less
    |   |       |       |       |-- responsive.less
    |   |       |       |       |-- default
    |   |       |       |       |   |-- 32px.png
    |   |       |       |       |   |-- 40px.png
    |   |       |       |       |   |-- style.css
    |   |       |       |       |   |-- style.less
    |   |       |       |       |   |-- throbber.gif
    |   |       |       |       |-- default-dark
    |   |       |       |           |-- 32px.png
    |   |       |       |           |-- 40px.png
    |   |       |       |           |-- style.css
    |   |       |       |           |-- style.less
    |   |       |       |           |-- throbber.gif
    |   |       |       |-- test
    |   |       |           |-- unit
    |   |       |           |   |-- index.html
    |   |       |           |   |-- test.js
    |   |       |           |   |-- libs
    |   |       |           |       |-- qunit.css
    |   |       |           |       |-- qunit.js
    |   |       |           |-- visual
    |   |       |               |-- desktop
    |   |       |               |   |-- index.html
    |   |       |               |-- mobile
    |   |       |               |   |-- index.html
    |   |       |               |-- screenshots
    |   |       |                   |-- desktop
    |   |       |                   |   |-- .png
    |   |       |                   |   |-- desktop.png
    |   |       |                   |   |-- home.png
    |   |       |                   |-- mobile
    |   |       |                       |-- .png
    |   |       |                       |-- home.png
    |   |       |                       |-- mobile.png
    |   |       |-- templates
    |   |           |-- admin.html
    |   |           |-- cards.html
    |   |           |-- error.html
    |   |           |-- index.html
    |   |           |-- login.html
    |   |           |-- bg
    |   |           |   |-- index.html
    |   |           |-- book
    |   |           |   |-- detail.html
    |   |           |   |-- list.html
    |   |           |-- footer
    |   |           |   |-- footer.html
    |   |           |-- fragments
    |   |           |   |-- alert.html
    |   |           |   |-- footer.html
    |   |           |   |-- header.html
    |   |           |-- gprs
    |   |           |   |-- show.html
    |   |           |-- header
    |   |           |   |-- header.html
    |   |           |-- meters
    |   |           |   |-- show.html
    |   |           |-- order
    |   |           |   |-- show.html
    |   |           |-- tree
    |   |           |   |-- tree.html
    |   |           |-- upload
    |   |           |   |-- upload.html
    |   |           |-- user
    |   |               |-- index.html
    |   |               |-- list.html
    |   |               |-- userAdd.html
    |   |               |-- userEdit.html
    |   |-- test
    |       |-- java
    |           |-- com
    |               |-- reason
    |                   |-- gsny
    |                       |-- GsnyApplicationTests.java
    |-- target
        |-- classes
        |   |-- application-dev.properties
        |   |-- application-prod.properties
        |   |-- application.yml
        |   |-- com
        |   |   |-- reason
        |   |       |-- gsny
        |   |           |-- Main$AuditorAwareSecurityImpl.class
        |   |           |-- Main.class
        |   |           |-- ServletInitializer.class
        |   |           |-- api
        |   |           |   |-- AuthenticateApi.class
        |   |           |   |-- GprsApi.class
        |   |           |   |-- MetersApi.class
        |   |           |   |-- OrderApi.class
        |   |           |   |-- TreeApi.class
        |   |           |   |-- bg
        |   |           |       |-- BgAreaDeviceApi.class
        |   |           |       |-- BgAreaUserApi.class
        |   |           |       |-- BgAreaWaterUsageApi.class
        |   |           |       |-- BgAreaWaterUsageTimeApi.class
        |   |           |-- config
        |   |           |   |-- GlobalCorsConfig$1.class
        |   |           |   |-- GlobalCorsConfig.class
        |   |           |   |-- JacksonConfig.class
        |   |           |   |-- SecurityConfig.class
        |   |           |   |-- StaticResourceConfiguration.class
        |   |           |   |-- Swagger2.class
        |   |           |-- controller
        |   |           |   |-- BookController.class
        |   |           |   |-- ErrorController.class
        |   |           |   |-- GprsController.class
        |   |           |   |-- IndexController.class
        |   |           |   |-- LoginController.class
        |   |           |   |-- MainController.class
        |   |           |   |-- MeterController.class
        |   |           |   |-- OrderController.class
        |   |           |   |-- TreeController.class
        |   |           |   |-- UserController.class
        |   |           |-- debug
        |   |           |   |-- MyApplicationContext.class
        |   |           |-- entity
        |   |           |   |-- AbstractAuditable.class
        |   |           |   |-- SysPermission.class
        |   |           |   |-- SysRole.class
        |   |           |   |-- SysUser.class
        |   |           |   |-- TableBillEntity.class
        |   |           |   |-- TableBuildingEntity.class
        |   |           |   |-- TableChargeRecordEntity.class
        |   |           |   |-- TableChargesEntity.class
        |   |           |   |-- TableChargingModelEntity.class
        |   |           |   |-- TableCollectorEntity.class
        |   |           |   |-- TableColumnEntity.class
        |   |           |   |-- TableComunicateModeEntity.class
        |   |           |   |-- TableConditionEntity.class
        |   |           |   |-- TableDailyEntity.class
        |   |           |   |-- TableDirectionEntity.class
        |   |           |   |-- TableEntranceEntity.class
        |   |           |   |-- TableExchangStationEntity.class
        |   |           |   |-- TableFactoryNameEntity.class
        |   |           |   |-- TableFaultInfoEntity.class
        |   |           |   |-- TableGprsEntity.class
        |   |           |   |-- TableInStallDirectionEntity.class
        |   |           |   |-- TableInstallEnvironmentEntity.class
        |   |           |   |-- TableInstallModeEntity.class
        |   |           |   |-- TableLoginEntity.class
        |   |           |   |-- TableMeterAppraisalEntity.class
        |   |           |   |-- TableMeterEntity.class
        |   |           |   |-- TableNoticeEntity.class
        |   |           |   |-- TableOpenMeterRecordEntity.class
        |   |           |   |-- TableOperateLogEntity.class
        |   |           |   |-- TablePayEntity.class
        |   |           |   |-- TablePaymentRecordEntity.class
        |   |           |   |-- TableProductTypeEntity.class
        |   |           |   |-- TableReChargeEntity.class
        |   |           |   |-- TableReportEntity.class
        |   |           |   |-- TableSupplierEntity.class
        |   |           |   |-- TableToConcentratorEntity.class
        |   |           |   |-- TableUserAggInfoEntity.class
        |   |           |   |-- TableUserEntity.class
        |   |           |   |-- TableUserTypeEntity.class
        |   |           |   |-- TableVillageEntity.class
        |   |           |   |-- TableWaterEntity.class
        |   |           |   |-- TreeEntity.class
        |   |           |   |-- User.class
        |   |           |   |-- bg
        |   |           |   |   |-- BgAreaDevice.class
        |   |           |   |   |-- BgAreaUser.class
        |   |           |   |   |-- BgAreaWaterUsage.class
        |   |           |   |   |-- BgAreaWaterUsageTime.class
        |   |           |   |-- dto
        |   |           |   |   |-- AreaDeviceGroup.class
        |   |           |   |   |-- AreaUserGroup.class
        |   |           |   |   |-- AreaWaterUsage.class
        |   |           |   |-- jwt
        |   |           |   |   |-- AuthenticationRequest.class
        |   |           |   |   |-- AuthenticationResponse.class
        |   |           |   |-- other
        |   |           |       |-- Io.class
        |   |           |-- handler
        |   |           |   |-- JwtRequestFilter.class
        |   |           |-- repository
        |   |           |   |-- GprsRepo.class
        |   |           |   |-- MeterRepo.class
        |   |           |   |-- OrderRepo.class
        |   |           |   |-- TableMeterRepo.class
        |   |           |   |-- UserDao.class
        |   |           |   |-- WaterRepo.class
        |   |           |   |-- bg
        |   |           |   |   |-- BgAreaDeviceRepo.class
        |   |           |   |   |-- BgAreaUserRepo.class
        |   |           |   |   |-- BgAreaWaterUsageRepo.class
        |   |           |   |   |-- BgAreaWaterUsageTimeRepo.class
        |   |           |   |-- impl
        |   |           |       |-- SimpleJpaRepositoryImpl.class
        |   |           |-- service
        |   |           |   |-- GprsService.class
        |   |           |   |-- MetersService.class
        |   |           |   |-- OrderService.class
        |   |           |   |-- TableMeterService.class
        |   |           |   |-- UserService.class
        |   |           |   |-- bg
        |   |           |   |   |-- BgAreaDeviceService.class
        |   |           |   |   |-- BgAreaUserService.class
        |   |           |   |-- impl
        |   |           |       |-- UserServiceImpl.class
        |   |           |-- support
        |   |           |   |-- MyUserDetailsService.class
        |   |           |-- util
        |   |               |-- AesException.class
        |   |               |-- ByteGroup.class
        |   |               |-- ConfigUtil.class
        |   |               |-- HttpUtil$1.class
        |   |               |-- HttpUtil$Response.class
        |   |               |-- HttpUtil.class
        |   |               |-- JwtUtil.class
        |   |               |-- MD5Util.class
        |   |               |-- PKCS7Encoder.class
        |   |               |-- SHA1.class
        |   |               |-- SignUtil$1.class
        |   |               |-- SignUtil.class
        |   |               |-- SqlServer2008Dialect.class
        |   |               |-- SQLServerNativeDialect.class
        |   |               |-- StringUtils.class
        |   |               |-- TradeNoUtil.class
        |   |               |-- Util.class
        |   |               |-- ValidataUtil.class
        |   |               |-- WXBizMsgCrypt.class
        |   |               |-- XMLParse.class
        |   |               |-- XmlUtil.class
        |   |-- META-INF
        |   |   |-- gsnyBoot.kotlin_module
        |   |-- public
        |   |   |-- a.txt
        |   |   |-- .idea
        |   |   |   |-- misc.xml
        |   |   |   |-- modules.xml
        |   |   |   |-- public.iml
        |   |   |   |-- vcs.xml
        |   |   |   |-- workspace.xml
        |   |   |   |-- inspectionProfiles
        |   |   |       |-- Project_Default.xml
        |   |   |-- build
        |   |       |-- asset-manifest.json
        |   |       |-- favicon.ico
        |   |       |-- index.html
        |   |       |-- logo192.png
        |   |       |-- logo512.png
        |   |       |-- manifest.json
        |   |       |-- precache-manifest.3eb6743fd3fc758d0e2bfe4d8d42d4b0.js
        |   |       |-- robots.txt
        |   |       |-- service-worker.js
        |   |       |-- static
        |   |           |-- css
        |   |           |   |-- 2.f9c694ef.chunk.css
        |   |           |   |-- 2.f9c694ef.chunk.css.map
        |   |           |   |-- main.5ecd60fb.chunk.css
        |   |           |   |-- main.5ecd60fb.chunk.css.map
        |   |           |-- js
        |   |               |-- 2.179a3ac9.chunk.js
        |   |               |-- 2.179a3ac9.chunk.js.LICENSE.txt
        |   |               |-- 2.179a3ac9.chunk.js.map
        |   |               |-- main.87d91849.chunk.js
        |   |               |-- main.87d91849.chunk.js.map
        |   |               |-- runtime-main.3aa28d22.js
        |   |               |-- runtime-main.3aa28d22.js.map
        |   |-- static
        |   |   |-- css
        |   |   |   |-- admin.css
        |   |   |   |-- aside.css
        |   |   |   |-- blog.css
        |   |   |   |-- bootstrap-grid.css
        |   |   |   |-- bootstrap-grid.css.map
        |   |   |   |-- bootstrap-grid.min.css
        |   |   |   |-- bootstrap-grid.min.css.map
        |   |   |   |-- bootstrap-reboot.css
        |   |   |   |-- bootstrap-reboot.css.map
        |   |   |   |-- bootstrap-reboot.min.css
        |   |   |   |-- bootstrap-reboot.min.css.map
        |   |   |   |-- bootstrap.css
        |   |   |   |-- bootstrap.css.map
        |   |   |   |-- bootstrap.min.css
        |   |   |   |-- bootstrap.min.css.map
        |   |   |   |-- bulma-divider.min.css
        |   |   |   |-- bulma.css
        |   |   |   |-- bulma.css.map
        |   |   |   |-- bulma.min.css
        |   |   |   |-- cards.css
        |   |   |   |-- cheatsheet.css
        |   |   |   |-- comon0.css
        |   |   |   |-- contact.css
        |   |   |   |-- forum.css
        |   |   |   |-- hero.css
        |   |   |   |-- inbox.css
        |   |   |   |-- index.css
        |   |   |   |-- instaAlbum.css
        |   |   |   |-- kanban.css
        |   |   |   |-- landing.css
        |   |   |   |-- login.css
        |   |   |   |-- personal.css
        |   |   |   |-- prism.css
        |   |   |   |-- showcase.css
        |   |   |   |-- tabs.css
        |   |   |-- images
        |   |   |   |-- admin.png
        |   |   |   |-- band.png
        |   |   |   |-- bg.jpg
        |   |   |   |-- blog.png
        |   |   |   |-- blog2.png
        |   |   |   |-- bulma.png
        |   |   |   |-- cards.png
        |   |   |   |-- cheatsheet.png
        |   |   |   |-- contact.png
        |   |   |   |-- cover.png
        |   |   |   |-- favicon.png
        |   |   |   |-- fav_icon.png
        |   |   |   |-- first-post.png
        |   |   |   |-- forum.png
        |   |   |   |-- head_bg.png
        |   |   |   |-- hero.png
        |   |   |   |-- inbox.png
        |   |   |   |-- instaalbum.png
        |   |   |   |-- kanban.png
        |   |   |   |-- kanban2.png
        |   |   |   |-- landing.png
        |   |   |   |-- loading.gif
        |   |   |   |-- login.png
        |   |   |   |-- modalcards.png
        |   |   |   |-- personal.png
        |   |   |   |-- showcase.png
        |   |   |   |-- tabs.png
        |   |   |-- js
        |   |   |   |-- bootstrap.bundle.js
        |   |   |   |-- bootstrap.bundle.js.map
        |   |   |   |-- bootstrap.bundle.min.js
        |   |   |   |-- bootstrap.bundle.min.js.map
        |   |   |   |-- bootstrap.js
        |   |   |   |-- bootstrap.js.map
        |   |   |   |-- bootstrap.min.js
        |   |   |   |-- bootstrap.min.js.map
        |   |   |   |-- bulma.js
        |   |   |   |-- echarts.min.js
        |   |   |   |-- jquery.cxselect.min.js
        |   |   |   |-- jquery.js
        |   |   |   |-- jquery.liMarquee.js
        |   |   |   |-- js.js
        |   |   |   |-- kanban-switch.js
        |   |   |   |-- kanban.js
        |   |   |   |-- showcase.js
        |   |   |   |-- tabs.js
        |   |   |-- jstree
        |   |       |-- .gitignore
        |   |       |-- bower.json
        |   |       |-- component.json
        |   |       |-- composer.json
        |   |       |-- gruntfile.js
        |   |       |-- jstree.jquery.json
        |   |       |-- LICENSE-MIT
        |   |       |-- package.json
        |   |       |-- README.md
        |   |       |-- demo
        |   |       |   |-- README.md
        |   |       |   |-- basic
        |   |       |       |-- index.html
        |   |       |       |-- root.json
        |   |       |-- dist
        |   |       |   |-- jstree.js
        |   |       |   |-- jstree.min.js
        |   |       |   |-- themes
        |   |       |       |-- default
        |   |       |       |   |-- 32px.png
        |   |       |       |   |-- 40px.png
        |   |       |       |   |-- style.css
        |   |       |       |   |-- style.min.css
        |   |       |       |   |-- throbber.gif
        |   |       |       |-- default-dark
        |   |       |           |-- 32px.png
        |   |       |           |-- 40px.png
        |   |       |           |-- style.css
        |   |       |           |-- style.min.css
        |   |       |           |-- throbber.gif
        |   |       |-- src
        |   |       |   |-- intro.js
        |   |       |   |-- jstree.changed.js
        |   |       |   |-- jstree.checkbox.js
        |   |       |   |-- jstree.conditionalselect.js
        |   |       |   |-- jstree.contextmenu.js
        |   |       |   |-- jstree.dnd.js
        |   |       |   |-- jstree.js
        |   |       |   |-- jstree.massload.js
        |   |       |   |-- jstree.search.js
        |   |       |   |-- jstree.sort.js
        |   |       |   |-- jstree.state.js
        |   |       |   |-- jstree.types.js
        |   |       |   |-- jstree.unique.js
        |   |       |   |-- jstree.wholerow.js
        |   |       |   |-- misc.js
        |   |       |   |-- outro.js
        |   |       |   |-- sample.js
        |   |       |   |-- vakata-jstree.js
        |   |       |   |-- themes
        |   |       |       |-- base.less
        |   |       |       |-- main.less
        |   |       |       |-- mixins.less
        |   |       |       |-- responsive.less
        |   |       |       |-- default
        |   |       |       |   |-- 32px.png
        |   |       |       |   |-- 40px.png
        |   |       |       |   |-- style.css
        |   |       |       |   |-- style.less
        |   |       |       |   |-- throbber.gif
        |   |       |       |-- default-dark
        |   |       |           |-- 32px.png
        |   |       |           |-- 40px.png
        |   |       |           |-- style.css
        |   |       |           |-- style.less
        |   |       |           |-- throbber.gif
        |   |       |-- test
        |   |           |-- unit
        |   |           |   |-- index.html
        |   |           |   |-- test.js
        |   |           |   |-- libs
        |   |           |       |-- qunit.css
        |   |           |       |-- qunit.js
        |   |           |-- visual
        |   |               |-- desktop
        |   |               |   |-- index.html
        |   |               |-- mobile
        |   |               |   |-- index.html
        |   |               |-- screenshots
        |   |                   |-- desktop
        |   |                   |   |-- .png
        |   |                   |   |-- desktop.png
        |   |                   |   |-- home.png
        |   |                   |-- mobile
        |   |                       |-- .png
        |   |                       |-- home.png
        |   |                       |-- mobile.png
        |   |-- templates
        |       |-- admin.html
        |       |-- cards.html
        |       |-- error.html
        |       |-- index.html
        |       |-- login.html
        |       |-- bg
        |       |   |-- index.html
        |       |-- book
        |       |   |-- detail.html
        |       |   |-- list.html
        |       |-- footer
        |       |   |-- footer.html
        |       |-- fragments
        |       |   |-- alert.html
        |       |   |-- footer.html
        |       |   |-- header.html
        |       |-- gprs
        |       |   |-- show.html
        |       |-- header
        |       |   |-- header.html
        |       |-- meters
        |       |   |-- show.html
        |       |-- order
        |       |   |-- show.html
        |       |-- tree
        |       |   |-- tree.html
        |       |-- upload
        |       |   |-- upload.html
        |       |-- user
        |           |-- index.html
        |           |-- list.html
        |           |-- userAdd.html
        |           |-- userEdit.html
        |-- generated-sources
        |   |-- annotations
        |-- generated-test-sources
        |   |-- test-annotations
        |-- test-classes
            |-- com
                |-- reason
                    |-- gsny
                        |-- GsnyApplicationTests.class 
