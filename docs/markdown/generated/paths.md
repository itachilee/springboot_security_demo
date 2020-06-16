
<a name="paths"></a>
## 资源

<a name="authenticate-api_resource"></a>
### Authenticate-api
Authenticate Api


<a name="createauthenticationtokenusingpost"></a>
#### createAuthenticationToken
```
POST /api/v1/authenticate
```


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
  "password" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
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


<a name="getgprslistusingget"></a>
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



