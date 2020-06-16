
<a name="definitions"></a>
## 定义

<a name="authenticationrequest"></a>
### AuthenticationRequest

|名称|说明|类型|
|---|---|---|
|**password**  <br>*可选*|**样例** : `"string"`|string|
|**username**  <br>*可选*|**样例** : `"string"`|string|


<a name="a3520342bee97ff5e77ef889d58513ce"></a>
### Iterable«TableGprsEntity»
*类型* : object


<a name="ea78d4db71c000960ecfc29750df8de0"></a>
### Iterable«TableMeterEntity»
*类型* : object


<a name="0905d62ed33762fa6cc4db5d9d77d0e9"></a>
### Iterable«TableToConcentratorEntity»
*类型* : object


<a name="modelandview"></a>
### ModelAndView

|名称|说明|类型|
|---|---|---|
|**empty**  <br>*可选*|**样例** : `true`|boolean|
|**model**  <br>*可选*|**样例** : `"object"`|object|
|**modelMap**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**reference**  <br>*可选*|**样例** : `true`|boolean|
|**status**  <br>*可选*|**样例** : `"string"`|enum (100 CONTINUE, 101 SWITCHING_PROTOCOLS, 102 PROCESSING, 103 CHECKPOINT, 200 OK, 201 CREATED, 202 ACCEPTED, 203 NON_AUTHORITATIVE_INFORMATION, 204 NO_CONTENT, 205 RESET_CONTENT, 206 PARTIAL_CONTENT, 207 MULTI_STATUS, 208 ALREADY_REPORTED, 226 IM_USED, 300 MULTIPLE_CHOICES, 301 MOVED_PERMANENTLY, 302 FOUND, 302 MOVED_TEMPORARILY, 303 SEE_OTHER, 304 NOT_MODIFIED, 305 USE_PROXY, 307 TEMPORARY_REDIRECT, 308 PERMANENT_REDIRECT, 400 BAD_REQUEST, 401 UNAUTHORIZED, 402 PAYMENT_REQUIRED, 403 FORBIDDEN, 404 NOT_FOUND, 405 METHOD_NOT_ALLOWED, 406 NOT_ACCEPTABLE, 407 PROXY_AUTHENTICATION_REQUIRED, 408 REQUEST_TIMEOUT, 409 CONFLICT, 410 GONE, 411 LENGTH_REQUIRED, 412 PRECONDITION_FAILED, 413 PAYLOAD_TOO_LARGE, 413 REQUEST_ENTITY_TOO_LARGE, 414 URI_TOO_LONG, 414 REQUEST_URI_TOO_LONG, 415 UNSUPPORTED_MEDIA_TYPE, 416 REQUESTED_RANGE_NOT_SATISFIABLE, 417 EXPECTATION_FAILED, 418 I_AM_A_TEAPOT, 419 INSUFFICIENT_SPACE_ON_RESOURCE, 420 METHOD_FAILURE, 421 DESTINATION_LOCKED, 422 UNPROCESSABLE_ENTITY, 423 LOCKED, 424 FAILED_DEPENDENCY, 426 UPGRADE_REQUIRED, 428 PRECONDITION_REQUIRED, 429 TOO_MANY_REQUESTS, 431 REQUEST_HEADER_FIELDS_TOO_LARGE, 451 UNAVAILABLE_FOR_LEGAL_REASONS, 500 INTERNAL_SERVER_ERROR, 501 NOT_IMPLEMENTED, 502 BAD_GATEWAY, 503 SERVICE_UNAVAILABLE, 504 GATEWAY_TIMEOUT, 505 HTTP_VERSION_NOT_SUPPORTED, 506 VARIANT_ALSO_NEGOTIATES, 507 INSUFFICIENT_STORAGE, 508 LOOP_DETECTED, 509 BANDWIDTH_LIMIT_EXCEEDED, 510 NOT_EXTENDED, 511 NETWORK_AUTHENTICATION_REQUIRED)|
|**view**  <br>*可选*|**样例** : `"[view](#view)"`|[View](#view)|
|**viewName**  <br>*可选*|**样例** : `"string"`|string|


<a name="tablegprsentity"></a>
### TableGprsEntity

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"[timestamp](#timestamp)"`|[Timestamp](#timestamp)|
|**holder**  <br>*可选*|**样例** : `"string"`|string|
|**imei**  <br>*可选*|**样例** : `0`|integer (int64)|
|**imeiName**  <br>*可选*|**样例** : `"string"`|string|
|**imeiid**  <br>*可选*|**样例** : `0`|integer (int64)|
|**includeMeterId**  <br>*可选*|**样例** : `"string"`|string|
|**ip**  <br>*可选*|**样例** : `"string"`|string|
|**loginTime**  <br>*可选*|**样例** : `"string"`|string|
|**pass**  <br>*可选*|**样例** : `"string"`|string|
|**port**  <br>*可选*|**样例** : `"string"`|string|
|**service**  <br>*可选*|**样例** : `"string"`|string|
|**sim**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string|


<a name="tablemeterentity"></a>
### TableMeterEntity

|名称|说明|类型|
|---|---|---|
|**buildingId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**collectorId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**comunicateModeId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createTime**  <br>*可选*|**样例** : `"[timestamp](#timestamp)"`|[Timestamp](#timestamp)|
|**electric**  <br>*可选*|**样例** : `0.0`|number (double)|
|**entranceId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**exchangStationId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**flowRate**  <br>*可选*|**样例** : `0.0`|number (double)|
|**imeiId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**meterIDid**  <br>*可选*|**样例** : `0`|integer (int64)|
|**meterSize**  <br>*可选*|**样例** : `"string"`|string|
|**operate_ValveStatus**  <br>*可选*|**样例** : `"string"`|string|
|**pressure**  <br>*可选*|**样例** : `0.0`|number (double)|
|**remainTotal**  <br>*可选*|**样例** : `0.0`|number (double)|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**supplierId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**text**  <br>*可选*|**样例** : `0`|integer (int64)|
|**updateTime**  <br>*可选*|**样例** : `"[timestamp](#timestamp)"`|[Timestamp](#timestamp)|
|**useTime**  <br>*可选*|**样例** : `"string"`|string|
|**userID**  <br>*可选*|**样例** : `0`|integer (int32)|
|**valveStatus**  <br>*可选*|**样例** : `"string"`|string|
|**villageId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**vol**  <br>*可选*|**样例** : `"string"`|string|


<a name="tabletoconcentratorentity"></a>
### TableToConcentratorEntity

|名称|说明|类型|
|---|---|---|
|**actionTime**  <br>*可选*|**样例** : `0`|integer (int32)|
|**cmdCode**  <br>*可选*|**样例** : `"string"`|string|
|**cmdInfo**  <br>*可选*|**样例** : `"string"`|string|
|**cmdName**  <br>*可选*|**样例** : `"string"`|string|
|**collector**  <br>*可选*|**样例** : `"string"`|string|
|**genTime**  <br>*可选*|**样例** : `"string"`|string (date)|
|**imei**  <br>*可选*|**样例** : `0`|integer (int64)|
|**isOver**  <br>*可选*|**样例** : `0`|integer (int32)|
|**meterId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**note**  <br>*可选*|**样例** : `"string"`|string|
|**openPoint**  <br>*可选*|**样例** : `"string"`|string|
|**operator**  <br>*可选*|**样例** : `"string"`|string|
|**returnTime**  <br>*可选*|**样例** : `"string"`|string (date)|
|**sendId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**sendedTime**  <br>*可选*|**样例** : `"string"`|string (date)|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**tryTimes**  <br>*可选*|**样例** : `0`|integer (int32)|
|**userid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**water**  <br>*可选*|**样例** : `"string"`|string|
|**waterId**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="timestamp"></a>
### Timestamp

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|**样例** : `0`|integer (int32)|
|**day**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hours**  <br>*可选*|**样例** : `0`|integer (int32)|
|**minutes**  <br>*可选*|**样例** : `0`|integer (int32)|
|**month**  <br>*可选*|**样例** : `0`|integer (int32)|
|**nanos**  <br>*可选*|**样例** : `0`|integer (int32)|
|**seconds**  <br>*可选*|**样例** : `0`|integer (int32)|
|**time**  <br>*可选*|**样例** : `0`|integer (int64)|
|**timezoneOffset**  <br>*可选*|**样例** : `0`|integer (int32)|
|**year**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="treeentity"></a>
### TreeEntity

|名称|说明|类型|
|---|---|---|
|**children**  <br>*可选*|**样例** : `[ "[tablemeterentity](#tablemeterentity)" ]`|< [TableMeterEntity](#tablemeterentity) > array|
|**id**  <br>*可选*|**样例** : `0`|integer (int64)|
|**text**  <br>*可选*|**样例** : `"string"`|string|


<a name="user"></a>
### User

|名称|说明|类型|
|---|---|---|
|**age**  <br>*可选*|**样例** : `0`|integer (int32)|
|**birthday**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**name**  <br>*可选*|**样例** : `"string"`|string|


<a name="view"></a>
### View

|名称|说明|类型|
|---|---|---|
|**contentType**  <br>*可选*|**样例** : `"string"`|string|



