# REST接口定义


<a name="overview"></a>
## 概览
用于测试RESTful API


### 版本信息
*版本* : 1.0


### URI scheme
*域名* : localhost:1978  
*基础路径* : /  
*方案* : HTTP


### 标签

* authenticate-api : Authenticate Api
* bg-area-device-api : Bg Area Device Api
* bg-area-user-api : Bg Area User Api
* bg-area-water-usage-api : Bg Area Water Usage Api
* bg-area-water-usage-time-api : Bg Area Water Usage Time Api
* bg-water-wasted-api : Bg Water Wasted Api
* book-controller : Book Controller
* gprs-api : Gprs Api
* gprs-controller : Gprs Controller
* index-controller : Index Controller
* login-controller : Login Controller
* main-controller : Main Controller
* meter-controller : Meter Controller
* order-api : Order Api
* order-controller : Order Controller
* tree-api : Tree Api
* tree-controller : Tree Controller
* user-controller : User Controller
* 阀控器 : Meters Api




<a name="paths"></a>
## 资源

<a name="authenticate-api_resource"></a>
### Authenticate-api
Authenticate Api


<a name="createauthenticationtokenusingpost"></a>
#### 生成jwt令牌
```
POST /api/v1/authenticate
```


##### 说明
用于生成jwt令牌


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**authenticationRequest**  <br>*必填*|authenticationRequest|[AuthenticationRequest](#authenticationrequest)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|object|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/authenticate
```


###### 请求 body
```json
{
  "username" : "string",
  "password" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="bg-area-device-api_resource"></a>
### Bg-area-device-api
Bg Area Device Api


<a name="getgprslistusingget"></a>
#### 获取区域设备信息
```
GET /api/bg/areaDevices
```


##### 说明
获取区域设备信息


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«BgAreaDevice»](#fcb1980824ceb6abf81931bcc9c6aca0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/areaDevices
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="findusergroupbyareausingget"></a>
#### 获取设备信息
```
GET /api/bg/findDeviceGroupByArea
```


##### 说明
获取用户信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaDeviceGroup](#areadevicegroup) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findDeviceGroupByArea
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "deviceType" : "string",
  "name" : "string",
  "value" : 0
} ]
```


<a name="bg-area-user-api_resource"></a>
### Bg-area-user-api
Bg Area User Api


<a name="getgprslistusingget_1"></a>
#### 获取区域用户信息
```
GET /api/bg/areaUsers
```


##### 说明
获取区域用户信息


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«BgAreaUser»](#3c62002e59471b551cb5ccfe2cc2f123)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/areaUsers
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="findusergroupbyareausingget_1"></a>
#### 获取区域用户信息
```
GET /api/bg/findUserGroupByArea
```


##### 说明
获取区域用户信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaUserGroup](#areausergroup) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findUserGroupByArea
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "areaGuid" : "string",
  "name" : "string",
  "value" : 0
} ]
```


<a name="bg-area-water-usage-api_resource"></a>
### Bg-area-water-usage-api
Bg Area Water Usage Api


<a name="findwaterandcostbyareausingget"></a>
#### 按区域分组获取到每组的用水量
```
GET /api/bg/findWaterAndCostByArea
```


##### 说明
按区域分组获取到每组的用水量


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterUsage2](#areawaterusage2) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByArea
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "area_guid" : "string",
  "cost_amount" : 0.0,
  "name" : "string",
  "value" : 0.0
} ]
```


<a name="findwaterandcostbyareagroupbymonthusingget"></a>
#### 按区域分组获取到每组的用水量並按分月進行分鐘
```
GET /api/bg/findWaterAndCostByAreaGroupByMonth
```


##### 说明
按区域分组获取到每组的用水量並按分月進行分組


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, < [AreaWaterUsage3](#areawaterusage3) > array > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByAreaGroupByMonth
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="findwaterandcostbydateusingget"></a>
#### 获取区域所有按年月分组的信息
```
GET /api/bg/findWaterAndCostByDate
```


##### 说明
获取区域所有按年月分组的信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterUsage](#areawaterusage) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByDate
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "cost_amount" : 0.0,
  "month" : 0,
  "water_usage" : 0.0,
  "year" : 0
} ]
```


<a name="findwaterandcostbydayusingget"></a>
#### 获取每天平均的用水量
```
GET /api/bg/findWaterAndCostByDay
```


##### 说明
获取每天平均的用水量


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterUsage](#areawaterusage) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByDay
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "cost_amount" : 0.0,
  "month" : 0,
  "water_usage" : 0.0,
  "year" : 0
} ]
```


<a name="findwaterandcostbyhourusingget"></a>
#### 获取一天中每小时平均的用水量
```
GET /api/bg/findWaterAndCostByHour
```


##### 说明
获取一天中每小时平均的用水量


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, < [AreaWaterUsage3](#areawaterusage3) > array > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByHour
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="findwaterandcostbymonthusingget"></a>
#### 获取每月平均的用水量
```
GET /api/bg/findWaterAndCostByMonth
```


##### 说明
获取每月平均的用水量


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterUsage](#areawaterusage) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByMonth
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "cost_amount" : 0.0,
  "month" : 0,
  "water_usage" : 0.0,
  "year" : 0
} ]
```


<a name="findwaterandcostbythismonthusingget"></a>
#### 获取区域当月用水与充值信息
```
GET /api/bg/findWaterAndCostByThisMonth
```


##### 说明
获取区域当月用水与充值信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterUsage](#areawaterusage) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findWaterAndCostByThisMonth
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "cost_amount" : 0.0,
  "month" : 0,
  "water_usage" : 0.0,
  "year" : 0
} ]
```


<a name="bg-area-water-usage-time-api_resource"></a>
### Bg-area-water-usage-time-api
Bg Area Water Usage Time Api


<a name="findareawaterusageusingget"></a>
#### 获取区域一天的用水信息
```
GET /api/bg/findAreaWaterUsage
```


##### 说明
获取区域一天的用水信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [BgAreaWaterUsageTime](#bgareawaterusagetime) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findAreaWaterUsage
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "area_guid" : "string",
  "area_name" : "string",
  "area_time_water_usage_0" : 0.0,
  "area_time_water_usage_10" : 0.0,
  "area_time_water_usage_12" : 0.0,
  "area_time_water_usage_14" : 0.0,
  "area_time_water_usage_16" : 0.0,
  "area_time_water_usage_18" : 0.0,
  "area_time_water_usage_2" : 0.0,
  "area_time_water_usage_20" : 0.0,
  "area_time_water_usage_22" : 0.0,
  "area_time_water_usage_24" : 0.0,
  "area_time_water_usage_4" : 0.0,
  "area_time_water_usage_6" : 0.0,
  "area_time_water_usage_8" : 0.0,
  "created_at" : "string",
  "created_by" : "string",
  "id" : 0,
  "updated_at" : "string",
  "updated_by" : "string"
} ]
```


<a name="bg-water-wasted-api_resource"></a>
### Bg-water-wasted-api
Bg Water Wasted Api


<a name="findbgwaterwastedbyareausingget"></a>
#### 获取区域已开阀用水量
```
GET /api/bg/findBgWaterWastedByArea
```


##### 说明
获取区域已开阀用水量


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [AreaWaterWasted](#areawaterwasted) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/bg/findBgWaterWastedByArea
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "area_guid" : "string",
  "area_name" : "string",
  "used_water" : 0.0
} ]
```


<a name="book-controller_resource"></a>
### Book-controller
Book Controller


<a name="addusingget"></a>
#### add
```
GET /book/add.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/book/add.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="detailusingget"></a>
#### detail
```
GET /book/detail.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/book/detail.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="listusingget"></a>
#### list
```
GET /book/list.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/book/list.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="gprs-api_resource"></a>
### Gprs-api
Gprs Api


<a name="getgprslistusingget_2"></a>
#### 获取集中器列表
```
GET /api/v1/gprs
```


##### 说明
获取集中器列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableGprsEntity»](#a3520342bee97ff5e77ef889d58513ce)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/gprs
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="updateuserusingpatch"></a>
#### 更新集中器
```
PATCH /api/v1/gprs/{id}
```


##### 说明
更新集中器


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|
|**Body**|**tableGprsEntity**  <br>*必填*|tableGprsEntity|[TableGprsEntity](#tablegprsentity)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**201**|Created|无内容|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/gprs/0
```


###### 请求 body
```json
{
  "address" : "string",
  "createTime" : {
    "date" : 0,
    "day" : 0,
    "hours" : 0,
    "minutes" : 0,
    "month" : 0,
    "nanos" : 0,
    "seconds" : 0,
    "time" : 0,
    "timezoneOffset" : 0,
    "year" : 0
  },
  "holder" : "string",
  "imei" : 0,
  "imeiName" : "string",
  "imeiid" : 0,
  "includeMeterId" : "string",
  "ip" : "string",
  "loginTime" : "string",
  "pass" : "string",
  "port" : "string",
  "service" : "string",
  "sim" : "string",
  "status" : "string",
  "updateTime" : "string"
}
```


<a name="getgprsbyimeiusingget"></a>
#### 通过集中器编号获取集中器
```
GET /api/v1/gprsByImei/{id}
```


##### 说明
通过集中器编号获取集中器


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[TableGprsEntity](#tablegprsentity)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/gprsByImei/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "address" : "string",
  "createTime" : {
    "date" : 0,
    "day" : 0,
    "hours" : 0,
    "minutes" : 0,
    "month" : 0,
    "nanos" : 0,
    "seconds" : 0,
    "time" : 0,
    "timezoneOffset" : 0,
    "year" : 0
  },
  "holder" : "string",
  "imei" : 0,
  "imeiName" : "string",
  "imeiid" : 0,
  "includeMeterId" : "string",
  "ip" : "string",
  "loginTime" : "string",
  "pass" : "string",
  "port" : "string",
  "service" : "string",
  "sim" : "string",
  "status" : "string",
  "updateTime" : "string"
}
```


<a name="getgprsofflinelistusingget"></a>
#### 获取不在线的集中器列表
```
GET /api/v1/gprsOffline
```


##### 说明
获取不在线的集中器列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableGprsEntity»](#a3520342bee97ff5e77ef889d58513ce)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/gprsOffline
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="getgprsonlinelistusingget"></a>
#### 获取在线的集中器列表
```
GET /api/v1/gprsOnline
```


##### 说明
获取在线的集中器列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableGprsEntity»](#a3520342bee97ff5e77ef889d58513ce)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/gprsOnline
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="gprs-controller_resource"></a>
### Gprs-controller
Gprs Controller


<a name="getlistusingget"></a>
#### getList
```
GET /gprs
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/gprs
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="getlistbystatususingget"></a>
#### getListByStatus
```
GET /gprsByStatus
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/gprsByStatus
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="showmetersusingget"></a>
#### showMeters
```
GET /showMeters
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**id**  <br>*可选*|id|integer (int64)|`0`|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/showMeters
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="index-controller_resource"></a>
### Index-controller
Index Controller


<a name="bgusingpost"></a>
#### bg
```
POST /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusingget"></a>
#### bg
```
GET /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusingput"></a>
#### bg
```
PUT /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusingdelete"></a>
#### bg
```
DELETE /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusingpatch"></a>
#### bg
```
PATCH /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusinghead"></a>
#### bg
```
HEAD /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="bgusingoptions"></a>
#### bg
```
OPTIONS /bg/index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/bg/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingpost"></a>
#### index
```
POST /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingget"></a>
#### index
```
GET /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingput"></a>
#### index
```
PUT /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingdelete"></a>
#### index
```
DELETE /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingpatch"></a>
#### index
```
PATCH /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusinghead"></a>
#### index
```
HEAD /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingoptions"></a>
#### index
```
OPTIONS /index.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/index.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="login-controller_resource"></a>
### Login-controller
Login Controller


<a name="loginerrorusingpost"></a>
#### loginError
```
POST /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusingget"></a>
#### loginError
```
GET /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusingput"></a>
#### loginError
```
PUT /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusingdelete"></a>
#### loginError
```
DELETE /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusingpatch"></a>
#### loginError
```
PATCH /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusinghead"></a>
#### loginError
```
HEAD /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginerrorusingoptions"></a>
#### loginError
```
OPTIONS /login-error.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login-error.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingpost"></a>
#### login
```
POST /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingget"></a>
#### login
```
GET /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingput"></a>
#### login
```
PUT /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingdelete"></a>
#### login
```
DELETE /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingpatch"></a>
#### login
```
PATCH /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusinghead"></a>
#### login
```
HEAD /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="loginusingoptions"></a>
#### login
```
OPTIONS /login.html
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/login.html
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="main-controller_resource"></a>
### Main-controller
Main Controller


<a name="adminusingget"></a>
#### admin
```
GET /admin
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/admin
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="cardsusingget"></a>
#### cards
```
GET /cards
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cards
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="jsonusingget"></a>
#### json
```
GET /json
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/json
```


##### HTTP响应示例

###### 响应 200
```json
{
  "age" : 0,
  "birthday" : "string",
  "name" : "string"
}
```


<a name="readjsonasobjectusingpost"></a>
#### readJsonAsObject
```
POST /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusingget"></a>
#### readJsonAsObject
```
GET /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusingput"></a>
#### readJsonAsObject
```
PUT /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusingdelete"></a>
#### readJsonAsObject
```
DELETE /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusingpatch"></a>
#### readJsonAsObject
```
PATCH /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusinghead"></a>
#### readJsonAsObject
```
HEAD /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonasobjectusingoptions"></a>
#### readJsonAsObject
```
OPTIONS /readjsonasobject
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonasobject
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingpost"></a>
#### readJsonString
```
POST /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingget"></a>
#### readJsonString
```
GET /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingput"></a>
#### readJsonString
```
PUT /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingdelete"></a>
#### readJsonString
```
DELETE /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingpatch"></a>
#### readJsonString
```
PATCH /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusinghead"></a>
#### readJsonString
```
HEAD /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="readjsonstringusingoptions"></a>
#### readJsonString
```
OPTIONS /readjsonstring
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/readjsonstring
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingpost"></a>
#### serialization
```
POST /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingget"></a>
#### serialization
```
GET /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingput"></a>
#### serialization
```
PUT /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingdelete"></a>
#### serialization
```
DELETE /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingpatch"></a>
#### serialization
```
PATCH /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusinghead"></a>
#### serialization
```
HEAD /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="serializationusingoptions"></a>
#### serialization
```
OPTIONS /serialization
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/serialization
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="showusingget"></a>
#### show
```
GET /show
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/show
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="meter-controller_resource"></a>
### Meter-controller
Meter Controller


<a name="closemeterusingget"></a>
#### closeMeter
```
GET /closeMeter
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**id**  <br>*可选*|id|integer (int64)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/closeMeter
```


##### HTTP响应示例

###### 响应 200
```json
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="openmeterusingget"></a>
#### openMeter
```
GET /openMeter
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**id**  <br>*可选*|id|integer (int64)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/openMeter
```


##### HTTP响应示例

###### 响应 200
```json
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="order-api_resource"></a>
### Order-api
Order Api


<a name="getorderbysendidusingget"></a>
#### 通过命令序号获取命令监控列表
```
GET /api/v1/getOrderBySendId/{sendId}
```


##### 说明
通过命令序号获取命令监控列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**sendId**  <br>*必填*|sendId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[TableToConcentratorEntity](#tabletoconcentratorentity)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/getOrderBySendId/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "actionTime" : 0,
  "cmdCode" : "string",
  "cmdInfo" : "string",
  "cmdName" : "string",
  "collector" : "string",
  "genTime" : "string",
  "imei" : 0,
  "isOver" : 0,
  "meterId" : 0,
  "note" : "string",
  "openPoint" : "string",
  "operator" : "string",
  "returnTime" : "string",
  "sendId" : 0,
  "sendedTime" : "string",
  "status" : "string",
  "tryTimes" : 0,
  "userid" : 0,
  "water" : "string",
  "waterId" : 0
}
```


<a name="getorderlistusingget"></a>
#### 获取命令监控列表
```
GET /api/v1/orders
```


##### 说明
获取命令监控列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableToConcentratorEntity»](#0905d62ed33762fa6cc4db5d9d77d0e9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/orders
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="getorderisoverlistusingget"></a>
#### 获取命令监控列表
```
GET /api/v1/ordersIsOver
```


##### 说明
获取命令监控列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableToConcentratorEntity»](#0905d62ed33762fa6cc4db5d9d77d0e9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/ordersIsOver
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="getorderlistbystatususingget"></a>
#### 获取未执行完成命令监控列表
```
GET /api/v1/ordersNotOver
```


##### 说明
获取未执行完成监控列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableToConcentratorEntity»](#0905d62ed33762fa6cc4db5d9d77d0e9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/ordersNotOver
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="order-controller_resource"></a>
### Order-controller
Order Controller


<a name="getlistbystatususingget_1"></a>
#### getListByStatus
```
GET /orders
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/orders
```


##### HTTP响应示例

###### 响应 200
```json
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="tree-api_resource"></a>
### Tree-api
Tree Api


<a name="getuserlistusingget"></a>
#### 获取用户列表
```
GET /api/tree
```


##### 说明
获取用户列表


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [TreeEntity](#treeentity) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/tree
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "children" : [ {
    "buildingId" : 0,
    "collectorId" : 0,
    "comunicateModeId" : 0,
    "createTime" : {
      "date" : 0,
      "day" : 0,
      "hours" : 0,
      "minutes" : 0,
      "month" : 0,
      "nanos" : 0,
      "seconds" : 0,
      "time" : 0,
      "timezoneOffset" : 0,
      "year" : 0
    },
    "electric" : 0.0,
    "entranceId" : 0,
    "exchangStationId" : 0,
    "flowRate" : 0.0,
    "imeiId" : 0,
    "meterIDid" : 0,
    "meterSize" : "string",
    "operate_ValveStatus" : "string",
    "pressure" : 0.0,
    "remainTotal" : 0.0,
    "status" : "string",
    "supplierId" : 0,
    "text" : 0,
    "updateTime" : {
      "date" : 0,
      "day" : 0,
      "hours" : 0,
      "minutes" : 0,
      "month" : 0,
      "nanos" : 0,
      "seconds" : 0,
      "time" : 0,
      "timezoneOffset" : 0,
      "year" : 0
    },
    "useTime" : "string",
    "userID" : 0,
    "valveStatus" : "string",
    "villageId" : 0,
    "vol" : "string"
  } ],
  "id" : 0,
  "text" : "string"
} ]
```


<a name="tree-controller_resource"></a>
### Tree-controller
Tree Controller


<a name="jsonusingget_1"></a>
#### json
```
GET /tree/data
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [TreeEntity](#treeentity) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/tree/data
```


##### HTTP响应示例

###### 响应 200
```json
[ {
  "children" : [ {
    "buildingId" : 0,
    "collectorId" : 0,
    "comunicateModeId" : 0,
    "createTime" : {
      "date" : 0,
      "day" : 0,
      "hours" : 0,
      "minutes" : 0,
      "month" : 0,
      "nanos" : 0,
      "seconds" : 0,
      "time" : 0,
      "timezoneOffset" : 0,
      "year" : 0
    },
    "electric" : 0.0,
    "entranceId" : 0,
    "exchangStationId" : 0,
    "flowRate" : 0.0,
    "imeiId" : 0,
    "meterIDid" : 0,
    "meterSize" : "string",
    "operate_ValveStatus" : "string",
    "pressure" : 0.0,
    "remainTotal" : 0.0,
    "status" : "string",
    "supplierId" : 0,
    "text" : 0,
    "updateTime" : {
      "date" : 0,
      "day" : 0,
      "hours" : 0,
      "minutes" : 0,
      "month" : 0,
      "nanos" : 0,
      "seconds" : 0,
      "time" : 0,
      "timezoneOffset" : 0,
      "year" : 0
    },
    "useTime" : "string",
    "userID" : 0,
    "valveStatus" : "string",
    "villageId" : 0,
    "vol" : "string"
  } ],
  "id" : 0,
  "text" : "string"
} ]
```


<a name="getlistusingget_1"></a>
#### getList
```
GET /tree/meters
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|object|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/tree/meters
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="treeusingget"></a>
#### tree
```
GET /tree/show
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/tree/show
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="user-controller_resource"></a>
### User-controller
User Controller


<a name="hiusingpost"></a>
#### hi
```
POST /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusingget"></a>
#### hi
```
GET /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusingput"></a>
#### hi
```
PUT /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusingdelete"></a>
#### hi
```
DELETE /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusingpatch"></a>
#### hi
```
PATCH /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusinghead"></a>
#### hi
```
HEAD /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="hiusingoptions"></a>
#### hi
```
OPTIONS /user/hi
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/hi
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="indexusingget_1"></a>
#### index
```
GET /user/index
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/index
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="6c574e622d974aacb81a977118de3b20"></a>
### 阀控器
Meters Api


<a name="findallusingget"></a>
#### 查询所有阀控器
```
GET /api/v1/allMeters
```


##### 说明
查询所有阀控器


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableMeterEntity»](#ea78d4db71c000960ecfc29750df8de0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/allMeters
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```


<a name="closemeterusingget_1"></a>
#### 获取集中器列表
```
GET /api/v1/closeMeter/{id}
```


##### 说明
获取集中器列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|integer (int64)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/closeMeter/0
```


##### HTTP响应示例

###### 响应 200
```json
0
```


<a name="openmeterusingget_1"></a>
#### 获取集中器列表
```
GET /api/v1/openMeter/{id}
```


##### 说明
获取集中器列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|integer (int64)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/openMeter/0
```


##### HTTP响应示例

###### 响应 200
```json
0
```


<a name="showmetersusingget_1"></a>
#### 获取集中器下的阀控器列表
```
GET /api/v1/showMeters/{imeiid}
```


##### 说明
获取集中器下的阀控器列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Path**|**imeiid**  <br>*必填*|imeiid|integer (int64)||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Iterable«TableMeterEntity»](#ea78d4db71c000960ecfc29750df8de0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/api/v1/showMeters/0
```


##### HTTP响应示例

###### 响应 200
```json
{ }
```




<a name="definitions"></a>
## 定义

<a name="areadevicegroup"></a>
### AreaDeviceGroup

|名称|说明|类型|
|---|---|---|
|**deviceType**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="areausergroup"></a>
### AreaUserGroup

|名称|说明|类型|
|---|---|---|
|**areaGuid**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="areawaterusage"></a>
### AreaWaterUsage

|名称|说明|类型|
|---|---|---|
|**cost_amount**  <br>*可选*|**样例** : `0.0`|number (double)|
|**month**  <br>*可选*|**样例** : `0`|integer (int32)|
|**water_usage**  <br>*可选*|**样例** : `0.0`|number (double)|
|**year**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="areawaterusage2"></a>
### AreaWaterUsage2

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**cost_amount**  <br>*可选*|**样例** : `0.0`|number (double)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `0.0`|number (double)|


<a name="areawaterusage3"></a>
### AreaWaterUsage3

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**area_name**  <br>*可选*|**样例** : `"string"`|string|
|**cost_amount**  <br>*可选*|**样例** : `0.0`|number (double)|
|**hour**  <br>*可选*|**样例** : `0`|integer (int32)|
|**water_usage**  <br>*可选*|**样例** : `0.0`|number (double)|


<a name="areawaterwasted"></a>
### AreaWaterWasted

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**area_name**  <br>*可选*|**样例** : `"string"`|string|
|**used_water**  <br>*可选*|**样例** : `0.0`|number (double)|


<a name="authenticationrequest"></a>
### AuthenticationRequest

|名称|说明|类型|
|---|---|---|
|**password**  <br>*可选*|**样例** : `"string"`|string|
|**username**  <br>*可选*|**样例** : `"string"`|string|


<a name="bgareadevice"></a>
### BgAreaDevice

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**area_name**  <br>*可选*|**样例** : `"string"`|string|
|**created_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**created_by**  <br>*可选*|**样例** : `"string"`|string|
|**device**  <br>*可选*|**样例** : `"string"`|string|
|**device_type**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int64)|
|**updated_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updated_by**  <br>*可选*|**样例** : `"string"`|string|


<a name="bgareauser"></a>
### BgAreaUser

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**area_name**  <br>*可选*|**样例** : `"string"`|string|
|**created_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**created_by**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int64)|
|**updated_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updated_by**  <br>*可选*|**样例** : `"string"`|string|
|**user_guid**  <br>*可选*|**样例** : `"string"`|string|
|**user_name**  <br>*可选*|**样例** : `"string"`|string|


<a name="bgareawaterusagetime"></a>
### BgAreaWaterUsageTime

|名称|说明|类型|
|---|---|---|
|**area_guid**  <br>*可选*|**样例** : `"string"`|string|
|**area_name**  <br>*可选*|**样例** : `"string"`|string|
|**area_time_water_usage_0**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_10**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_12**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_14**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_16**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_18**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_2**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_20**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_22**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_24**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_4**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_6**  <br>*可选*|**样例** : `0.0`|number (double)|
|**area_time_water_usage_8**  <br>*可选*|**样例** : `0.0`|number (double)|
|**created_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**created_by**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int64)|
|**updated_at**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updated_by**  <br>*可选*|**样例** : `"string"`|string|


<a name="fcb1980824ceb6abf81931bcc9c6aca0"></a>
### Iterable«BgAreaDevice»
*类型* : object


<a name="3c62002e59471b551cb5ccfe2cc2f123"></a>
### Iterable«BgAreaUser»
*类型* : object


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





