
-------------用户表：SYS_USER---------------------
DROP TABLE IF EXISTS SYS_USER;
CREATE TABLE SYS_USER (
	ID VARCHAR(32) not null COMMENT 'id',
	USER_NAME VARCHAR(64) not null COMMENT '账户名称',
	PASSWORD VARCHAR(16) not null COMMENT '密码',
	SALT VARCHAR(8) not null COMMENT '盐',
	AVATAR VARCHAR(200) COMMENT '头像',
	NAME VARCHAR(20) COMMENT '姓名',
	PHONE VARCHAR(18) COMMENT '电话',
	EMAIL VARCHAR(64) COMMENT '邮箱',
	SEX CHAR(1) COMMENT '性别',
	CREATER_USER VARCHAR(64) COMMENT '创建用户',
	UPDATE_USER VARCHAR(64) COMMENT '更新用户',
	CREATE_DATE DATE COMMENT '创建时间',
	UPDATE_DATE DATE COMMENT '更新时间',
	REMARK VARCHAR(200) COMMENT '备注',
	STATUS CHAR(1) not null default 0 COMMENT '状态（0:正常,1:无效）',
	DELETED CHAR(1) not null default 0 COMMENT '删除（0:正常,1:删除）',
	PRIMARY KEY (ID),
	UNIQUE KEY UNIQUE_USER_NAME (USER_NAME),
	KEY USER_NAME_DATE (USER_NAME,CREATE_DATE)
) COMMENT '用户表'; 
--------------------end-------------------

-------------角色表：SYS_ROLE---------------------
DROP TABLE IF EXISTS SYS_ROLE;
CREATE TABLE SYS_ROLE(
	ID VARCHAR(32) not null COMMENT 'id',
	ROLE_NAME VARCHAR(64) not null COMMENT '角色名称',
	TITLE VARCHAR(64) COMMENT '角色标题',
	DESCRIPTION VARCHAR(200) COMMENT '角色描述',
	ORDERS INT COMMENT '排序',
	CREATER_USER VARCHAR(64) COMMENT '创建用户',
	UPDATE_USER VARCHAR(64) COMMENT '更新用户',
	CREATE_DATE DATE COMMENT '创建时间',
	UPDATE_DATE DATE COMMENT '更新时间',
	REMARK VARCHAR(200) COMMENT '备注',
	STATUS CHAR(1) not null default 0 COMMENT '状态（0:正常,1:无效）',
	DELETED CHAR(1) not null default 0 COMMENT '删除（0:正常,1:删除）',
	PRIMARY KEY (ID),
	KEY ORDERS_KEY (ORDERS)
) COMMENT '角色表';
--------------------end-------------------

-------------权限表：SYS_PERMISSION---------------------
DROP TABLE IF EXISTS SYS_PERMISSION;
CREATE TABLE SYS_PERMISSION(
	ID VARCHAR(32) not null COMMENT 'id',
	SYSTEM_ID VARCHAR(32) not null COMMENT '系统ID',
	PARENT_ID VARCHAR(32) not null COMMENT '上级ID',
	NAME VARCHAR(128) not null COMMENT '名称',
	TYPE CHAR(1) not null COMMENT '类型(0:菜单,1:按钮)',
	PERMISSION_VALUE VARCHAR(64) not null COMMENT '权限值',
	URL VARCHAR(200) not null COMMENT '路径',
	ICON VARCHAR(64) COMMENT '图标',
	ORDERS INT COMMENT '排序',
	CREATER_USER VARCHAR(64) COMMENT '创建用户',
	UPDATE_USER VARCHAR(64) COMMENT '更新用户',
	CREATE_DATE DATE COMMENT '创建时间',
	UPDATE_DATE DATE COMMENT '更新时间',
	REMARK VARCHAR(200) COMMENT '备注',
	STATUS CHAR(1) not null default 0 COMMENT '状态（0:正常,1:无效）',
	DELETED CHAR(1) not null default 0 COMMENT '删除（0:正常,1:删除）',
	PRIMARY KEY (ID),
	KEY ORDERS_KEY (ORDERS)
) COMMENT '权限表';
--------------------end-------------------

-------------系统表：SYS_SYSTEM---------------------
DROP TABLE IF EXISTS SYS_SYSTEM;
CREATE TABLE SYS_SYSTEM(
	ID VARCHAR(32) not null COMMENT 'id',
	ICON VARCHAR(64) COMMENT '系统图标',
	BASEPATH VARCHAR(200) not null COMMENT '系统路径',
	SYSTME_NAME VARCHAR(100) not null COMMENT '系统名称',
	TITLE VARCHAR(100) COMMENT '系统标题',
	DESCRIPTION VARCHAR(200) COMMENT '系统描述',
	ORDERS INT COMMENT '排序',
	CREATER_USER VARCHAR(64) COMMENT '创建用户',
	UPDATE_USER VARCHAR(64) COMMENT '更新用户',
	CREATE_DATE DATE COMMENT '创建时间',
	UPDATE_DATE DATE COMMENT '更新时间',
	REMARK VARCHAR(200) COMMENT '备注',
	STATUS CHAR(1) not null default 0 COMMENT '状态（0:正常,1:无效）',
	DELETED CHAR(1) not null default 0 COMMENT '删除（0:正常,1:删除）',
	PRIMARY KEY (ID),
	KEY ORDERS_KEY (ORDERS)
) COMMENT '系统表';
--------------------end-------------------

-------------用户角色关系表：SYS_USER_ROLE---------------------
DROP TABLE IF EXISTS SYS_USER_ROLE;
CREATE TABLE SYS_USER_ROLE(
	ID VARCHAR(32) not null COMMENT 'id',
	USER_ID VARCHAR(32) not null COMMENT '用户ID',
	ROLE_ID VARCHAR(32) not null COMMENT '角色ID',
	PRIMARY KEY (ID),
	FOREIGN KEY(USER_ID) REFERENCES SYS_USER(ID), 
	FOREIGN KEY(ROLE_ID) REFERENCES SYS_ROLE(ID)
) COMMENT '用户角色关系表';
--------------------end-------------------

-------------角色权限关系表：SYS_ROLE_PERMISSION---------------------
DROP TABLE IF EXISTS SYS_ROLE_PERMISSION;
CREATE TABLE SYS_ROLE_PERMISSION(
	ID VARCHAR(32) not null COMMENT 'id',	
	ROLE_ID VARCHAR(32) not null COMMENT '角色ID',
	PERMISSION_ID VARCHAR(32) not null COMMENT '角色ID',
	PRIMARY KEY (ID),
	FOREIGN KEY(ROLE_ID) REFERENCES SYS_ROLE(ID), 
	FOREIGN KEY(PERMISSION_ID) REFERENCES SYS_PERMISSION(ID)
) COMMENT '角色权限关系表';
--------------------end-------------------