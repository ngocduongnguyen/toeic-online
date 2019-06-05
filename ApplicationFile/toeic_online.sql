create table user(
	id bigint not null primary key auto_increment,
	name varchar(255) null,
	password varchar(255) null,
    fullname varchar(255) null,
	createddate timestamp null,
	createdby varchar(255) null,
	modifieddate timestamp null,
	modifiedby varchar(255) null
);

create table role (
	id bigint not null primary key auto_increment,
	name varchar (100),
	createddate timestamp null,
	createdby varchar(255) null,
	modifieddate timestamp null,
	modifiedby varchar(255) null
);

alter table user add column roleid bigint;
alter table user add constraint fk_user_role foreign key (roleid) references role(id);

insert into role(name) values('ADMIN'),('USER');

insert into user(name,password,fullname) values('admin','admin','Nguyen Ngoc Duong'),('khanh','khanh','Nguyen Ngoc Khanh');

create table listenguideline(
	id bigint not null primary key auto_increment,
    title text null,
    image varchar(255) null,
    content text null,
    createddate timestamp null,
	createdby varchar(255) null,
	modifieddate timestamp null,
	modifiedby varchar(255) null
);

create table comment(
	id bigint not null primary key auto_increment,
    content text null,
    createddate timestamp null,
	createdby varchar(255) null,
	modifieddate timestamp null,
	modifiedby varchar(255) null
);

alter table comment add column userid bigint;
alter table comment add constraint fk_comment_user foreign key (userid) references user(id);

alter table comment add column listenguidelineid bigint;
alter table comment add constraint fk_comment_listenguideline foreign key (listenguidelineid) references listenguideline(id);