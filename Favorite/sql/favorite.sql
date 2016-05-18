drop sequence TagSeq;
drop table Tag;
create table Tag(
	t_id int primary key,
	t_name varchar2(100) not null,
	t_count int not null
);
create sequence TagSeq start with 1 increment by 1;
insert into Tag values(TagSeq.Nextval,'java',2);
insert into Tag values(TagSeq.Nextval,'struts',1);
insert into Tag values(TagSeq.Nextval,'mybatis',3);
select * from Tag;
select distinct t_name from Tag
select * from Tag where t_id in (select max(t_id) from Tag group by t_name)



drop sequence FavoriteSeq;
drop table Favorite;
create table Favorite(
	f_id int primary key,
	f_label varchar2(1000) not null,
	f_url varchar2(300) not null,
	f_tags varchar2(1000),
	f_desc varchar2(2000)
);

create sequence FavoriteSeq start with 1 increment by 1;
insert into Favorite values(FavoriteSeq.Nextval,'orade','www.orade.com','java,orade','orade官方站点');
insert into Favorite values(FavoriteSeq.Nextval,'12345','www.12345.com','','12345官方站点');
insert into Favorite values(FavoriteSeq.Nextval,'搜狗','http://www.sougaou.com','sougou','aa');
insert into Favorite values(FavoriteSeq.Nextval,'新浪','http://www.sina.com','sina','国内外著名门户网站');
insert into Favorite values(FavoriteSeq.Nextval,'Apache Struts','http://www.apache.org/struts/','java,struts','Struts官方站点 ');


select * from Favorite where f_tags like '%mybatis%';
select rownum,f.* from Favorite f where rownum<6 order by f.f_id; 
select *from Favorite  order by f_id
select * from Favorite where rownum<3 order by f_id
select f.* from Favorite f  order by f.f_id 
select * top 3 from Favorite order by f_id

