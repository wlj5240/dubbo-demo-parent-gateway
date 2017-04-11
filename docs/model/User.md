###user表结构说明
---
序号|字段|表字段|类型|表类型|长度|精度|是否必填|默认值|备注
  ---|---|---|---|---|---|---|---|---|---
1|	id|	id|	Long|	BIGINT|	19|	0|	是|	null|	   
2|	username|	username|	String|	VARCHAR|	255|	0|	否|	null|	用户名   
3|	password|	password|	String|	VARCHAR|	255|	0|	否|	null|	密码   
4|	address|	address|	String|	VARCHAR|	255|	0|	否|	null|	地址   
5|	createdTime|	created_time|	Date|	DATETIME|	19|	0|	否|	null|	创建时间   
6|	desc|	desc|	Integer|	INT|	10|	0|	否|	null|	   

###user索引说明
---
索引名|索引类型
  ---|---
PRIMARY|	索引
