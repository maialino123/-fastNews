use new_jsp;

create table role
(
id bigint not null primary key auto_increment,
name varchar(255) null,
code varchar(255) null,
createddate timestamp null,
modifieddate timestamp null,
createdby varchar(255) null,
modifiedby varchar(255) null

);

create table users
(
id bigint not null primary key auto_increment,
username varchar(255) not null,
password varchar(255) not null,
status int null,
roleid bigint not null,
createddate timestamp null,
modifieddate timestamp null,
createdby varchar(255) null,
modifiedby varchar(255) null

);

alter table users add constraint foreign key (roleid) references role(id);


create table news
(

id bigint not null primary key auto_increment,
title varchar(255) null,
thumbnail varchar(255) null,
shortDescription text null,
content text null,
categoriesid bigint not null,
createddate timestamp null,
modifieddate timestamp null,
createdby varchar(255) null,
modifiedby varchar(255) null



);

create table categories 
(
id bigint not null primary key auto_increment,
name varchar(255) null,
code varchar(255) null,
createddate timestamp null,
modifieddate timestamp null,
createdby varchar(255) null,
modifiedby varchar(255) null

);	

alter table news add constraint foreign key (categoriesid) references categories(id);

create table comment
(
id bigint not null primary key auto_increment,
newsid bigint not null,
userid bigint not null,
createddate timestamp null,
modifieddate timestamp null,
createdby varchar(255) null,
modifiedby varchar(255) null

);

alter table comment add constraint foreign key (newsid) references news(id);
alter table comment add constraint foreign key (userid) references users(id);

insert into categories(name , code) values ('the thao','the-thao');
insert into categories(name , code) values ('chinh tri','chinh-tri');
insert into categories(name , code) values ('thoi su','thoi-su');
insert into categories(name , code) values ('van hoa','van-hoa');
insert into categories(name , code) values ('lao dong','lao-dong');

select * from categories;




