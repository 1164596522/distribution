create database Logistics

use logistics

-- 顾客表
create table customer
(
	cu_id int auto_increment primary key,	-- 顾客id（主键）
	role_id int references role (role_id),	-- 用户组（外键）
	customer_name varchar(20),	-- 顾客姓名
	customer_pwd varchar(20),	-- 顾客密码
	customer_sex	char(10) default '男' check (customer_sex='男' or customer_sex='女'),	-- 顾客性别
	brithday datetime,	-- 顾客出生日期
	tel varchar(20), -- 顾客电话
	address varchar(50),	-- 顾客住址
	remarks varchar(100)	-- 备注
) -- 完成

insert into customer values
(1,2,'灵遥','666666',default,'2000-12-09','10086','广东省珠海市斗门区','骄兵必败')

--	用户组表
create table role
(
	role_id int auto_increment primary key,	-- 主键用户组id（主键）
	role_name varchar(20),	-- 用户组名称
	remarks varchar(100)	-- 备注
) -- 完成

insert into role values
(1,'root','超级用户')
(2,'Administrator','VIP用户')


-- 交接单表
create table delivery_receipt
(
	delivery_receipt_id int auto_increment primary key,	-- 交接单id（主键）
	start_city varchar(20),	-- 起点城市
	end_city varchar(20),	-- 终点城市
	mid_city	varchar(20),	-- 已到城市
	make_dtae datetime null default current_timestamp,	-- 生成时间
	remarks varchar(100)	-- 备注
) -- 完成

insert into delivery_receipt values
(1,'深圳市','珠海市','东莞市',default,'那一笑，笑到了S9')
(2,'珠海市','中山市','深圳市',default,'青春果然是不完美的')

-- 省份表
create table privance
(
	privance_id int primary key,	-- 省份id（主键）
	privance_name varchar(20)	-- 省份名称
)-- 完成

insert into privance values
(440000,'广东省')

-- 城市表
create table city
(
	city_id int primary key,	-- 城市id（主键）
	city_name varchar(20), -- 城市名称
	privance_id int references privance (privance_id) -- 省份id（外键）
)-- 完成

insert into city values
(440300,'深圳市',440000)
(440400,'珠海市',440000)

-- 城市区域表
create table city_area
(
	area_id int primary key, -- 城市区域编号（主键）
	city_id int references city (city_id),	-- 城市编号（外键）
	range_id int references delivery_range (range_id),	-- 配送范围编号（外键）
	area_name varchar(20) -- 城市区域名称
)-- 完成

insert into city_area values
(440307,440300,1,'龙岗区')
(440402,440400,2,'香洲区')

-- 配送范围表
create table delivery_range
(
	range_id int auto_increment primary key,	-- 配送区域ID（主键）
	range_name varchar(20), -- 配送区域名称
	dep_id int references delivery_place(dep_id),	-- 配送点id（外键）
	area_id int references city_area(area_id), -- 城市区域编号（外键）
	delivery_price double, -- 配送价格
	remarks varchar(100) -- 备注
)-- 完成

insert into delivery_range values
(1,'龙岗区',1,440307,666,'G2:我把世界第一广告代言人打哭了')
(2,'香洲区',2,440402,666,'SKT:我连门票都没拿到')

-- 配送点表
create table delivery_place
(
	dep_id int auto_increment primary key,	-- 配送点id（主键）
	dep_name varchar(20), -- 配送点名称
	mq_id int references manager(mq_id), -- 管理员id（外键）
	privance_id	int references privance(privance_id), -- 省份id（外键）
	city_id int references privance(privance_id), -- 城市id（外键）
	dep_tel varchar(20), -- 电话
	dep_addr varchar(100), -- 地址
	remarks varchar(100) -- 备注
)-- 完成

insert into delivery_place values
(1,'RNG电竞俱乐部',1,440000,440300,'110','广东省深圳市RNG','年年被打哭，年年不长记性')
(2,'SKT电竞俱乐部',1,440000,440400,'119','广东省珠海市SKT','人家一保四，我就比较强了，四保一把那一保四的打哭了')

-- 管理员表
create table manager
(
	mq_id int auto_increment primary key, -- 管理员编号（主键）
	role_id int references role (role_id), -- 用户组id（外键）
	manager_name varchar(20), -- 姓名
	manager_pwd	varchar(20), -- 密码
	manager_sex varchar(10) default '男' check (manager_sex='男' or manager_sex='女'), -- 性别
	tel varchar(20), -- 电话
	address varchar(50), -- 住址
	remarks varchar(100), -- 备注
	state int default 1 -- 状态
)-- 完成

insert into manager values
(1,1,'将夜','233333',default,'10000','广东省深圳市龙岗区','希望越大,失望越大',default)

-- 路线表
create table route
(
	route_id int auto_increment primary key,	-- 路线id（主键）
	route_name varchar(20),	-- 路线名称
	start_province_id int references privance (privance_id),	-- 起点省份id（外键）
	start_city_id int references city (city_id),	-- 起点省份id（外键）
	mid_province_id int references privance (privance_id),	-- 已到点省份id（外键）
	mid_city_id int references city (city_id),	-- 已到省份id（外键）
	end_Province_id int references privance (privance_id),	-- 终点省份id（外键）
	end_city_id int references city (city_id),	-- 终点城市id（外键）
	transport_price double,	-- 运输价格
	remarks varchar(100)	-- 备注
)-- 完成
insert into route values
(1,'八强不归路',440000,440300,440000,440300,440000,440300,666.66,'赛前笑嘻嘻，赛后哭嘤嘤')
(2,'门票拿不到',440000,440400,440000,440400,440000,440400,666.66,'李哥托孤')

-- 车辆表
create table car
(
	car_id int auto_increment primary key, -- 车辆id （主键）
	route_id int references route (route_id), -- 路线id（外键）
	car_type varchar(20), -- 车辆型号 
	car_orgin varchar(50),	-- 产地
	car_pro_date datetime,	-- 生产日期
	car_biy_date datetime,	-- 购买日期
	remarks varchar(100)	-- 备注
) -- 完成

insert into car values
(1,1,'大奔','RNG','2018-10-20','2018-10-20','多接广告多赚钱')
(2,2,'大牛','SKT','2018-10-20','2018-10-20','李哥已经不是以前的李哥了')

-- 订单表
create table subscribe
(
	order_id int auto_increment primary key,	-- 订单编号（主键）
	delivery_receipt_id int references delivery_receipt (delivery_receipt_id),	-- 交接单编号（外键）
	car_id int references car (car_id),	-- 车辆id（外键） 
	cu_id	int references customer (cu_id),	-- 顾客id（外键） 
	post_name varchar(20), -- 邮寄人
	post_tel varchar(20), -- 邮寄人电话
	post_addr varchar(50), -- 邮寄地址
	get_name	varchar(20), -- 收货人
	get_tel varchar(20), -- 收货人电话
	get_addr varchar(50), -- 收货人地址
	goods_name varchar(100), -- 货物名称
	goods_weight double, -- 货物重量
	order_type int, -- 订单类型
	order_state int, -- 订单状态
	transport_price double, -- 运输价格
	delivery_price double, -- 配送价格
	total_price double, -- 总价格
	remarks varchar(100), -- 备注
	start_city varchar(20), -- 起点城市
	end_city varchar(20), -- 终点城市
	mid_city varchar(20) -- 已到城市
)-- 完成

insert into subscribe values
(1,1,1,1,'G2','120','欧美','RNG','119','中国','八强飞机票',999,4,1,125,125,250,'回家过年','欧美','中国','中国')
(2,2,2,2,'SKT','119','韩国','RNG','120','中国','八强飞机票',999,3,1,125,125,250,'回家过年','韩国','中国','中国')

