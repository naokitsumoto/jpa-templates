create table entity1 (
    id varchar(10) not null, 
    column1 varchar(10) not null, 
    column2 varchar(10) not null, 
    column3 varchar(10) not null, 
    primary key (id)
);
insert into entity1 values('1', 'foo', 'foo', 'foo');
insert into entity1 values('2', 'foo', 'foo', 'bar');
insert into entity1 values('3', 'foo', 'bar', 'bar');