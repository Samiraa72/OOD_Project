# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  id                        bigint auto_increment not null,
  auther_id                 bigint,
  content                   varchar(255),
  rate                      integer,
  event_id                  bigint,
  constraint pk_comment primary key (id))
;

create table course_page (
  id                        bigint auto_increment not null,
  time                      varchar(255),
  term                      varchar(255),
  name                      varchar(255),
  number                    integer,
  professor                 varchar(255),
  constraint pk_course_page primary key (id))
;

create table event (
  id                        bigint auto_increment not null,
  subject                   varchar(255),
  time                      varchar(255),
  content                   varchar(255),
  auther_id                 bigint,
  course_id                 bigint,
  constraint pk_event primary key (id))
;

create table exam (
  id                        bigint auto_increment not null,
  subject                   varchar(255),
  time                      varchar(255),
  file                      varchar(255),
  duration                  varchar(255),
  course_id                 bigint,
  constraint pk_exam primary key (id))
;

create table grade (
  id                        bigint auto_increment not null,
  time                      varchar(255),
  student_id                bigint,
  score                     integer,
  course_id                 bigint,
  constraint pk_grade primary key (id))
;

create table hw (
  id                        bigint auto_increment not null,
  subject                   varchar(255),
  deadline                  varchar(255),
  submit_time               varchar(255),
  file                      varchar(255),
  course_id                 bigint,
  constraint pk_hw primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table comment;

drop table course_page;

drop table event;

drop table exam;

drop table grade;

drop table hw;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

