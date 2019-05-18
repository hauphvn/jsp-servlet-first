CREATE TABLE role(
id bigint NOT NULL PRIMARY KEY auto_increment,
name VARCHAR(255) NOT NULL,
code VARCHAR(255) NOT NULL,
createdate TIMESTAMP NULL,
modifieddate TIMESTAMP NULL,
createdby VARCHAR(255) NULL,
modifiedby VARCHAR(255) NULL
);

CREATE TABLE user(
id bigint NOT NULL PRIMARY KEY auto_increment,
username VARCHAR(150) NOT NULL,
password VARCHAR(150) NOT NULL,
fullname VARCHAR(150) NULL,
status int NOT NULL,
roleid bigint NOT NULL,
createdate TIMESTAMP NULL,
modifieddate TIMESTAMP NULL,
createdby VARCHAR(255) NULL,
modifiedby VARCHAR(255) NULL
);

 ALTER TABLE user ADD CONSTRAINT  fk_role_user FOREIGN KEY (userid) REFERENCES role(id);


CREATE TABLE news(
id bigint NOT NULL PRIMARY KEY auto_increment,
categoryid bigint NOT NULL,
content TEXT NULL,
title VARCHAR(255) NULL,
thumbnail VARCHAR(255) NULL,
shortdescription TEXT NULL,
createdate TIMESTAMP NULL,
modifieddate TIMESTAMP NULL,
createdby VARCHAR(255) NULL,
modifiedby VARCHAR(255) NULL
);

CREATE TABLE category(
id bigint NOT NULL PRIMARY KEY auto_increment,
name VARCHAR(255) NOT NULL,
code VARCHAR(255) NOT NULL,
createdate TIMESTAMP NULL,
modifieddate TIMESTAMP NULL,
createdby VARCHAR(255) NULL,
modifiedby VARCHAR(255) NULL
);

 ALTER TABLE news ADD CONSTRAINT  fk_news_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE comment(
id bigint NOT NULL PRIMARY KEY auto_increment,
content TEXT NOT NULL,
userid bigint NOT NULL,
newsid bigint NOT NULL,
createdate TIMESTAMP NULL,
modifieddate TIMESTAMP NULL,
createdby VARCHAR(255) NULL,
modifiedby VARCHAR(255) NULL
);

 ALTER TABLE comment ADD CONSTRAINT  fk_comment_user FOREIGN KEY (userid) REFERENCES user(id);
 ALTER TABLE comment ADD CONSTRAINT  fk_comment_news FOREIGN KEY (newsid) REFERENCES news(id);


-- Insert data
insert into category(code,name) values('the-thao','Thể thao');
insert into category(code,name) values('the-gioi','Thế giới');
insert into category(code,name) values('chinh-tri','Chính trị');
insert into category(code,name) values('thoi-su','Thời sự');
insert into category(code,name) values('goc-nhin','Góc nhìn');

insert into news(categoryid,title) values(1,'Bài viết thể thao 1');
insert into news(categoryid,title) values(1,'Bài viết thể thao 2');
insert into news(categoryid,title) values(2,'Bài viết thế giới 1');

insert into role(name,code) values('QUAN TRI','ADMIN');
insert into role(name,code) values('NGUOI DUNG','USER');

insert into user(username,password,fullname,status,roleid) values('admin','123','admin',1,1);
insert into user(username,password,fullname,status,roleid) values('nguyenvana','123','Nguyen Van A',1,2);
insert into user(username,password,fullname,status,roleid) values('nguyenvanb','123','Nguyen Van B',1,2);

insert into comment(content, userid, newsid) values('Noi dung comment', 2, 29);
insert into comment(content, userid, newsid) values('Noi dung comment', 2, 30);
