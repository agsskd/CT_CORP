--------------------------------------------------------
--  File created - Tuesday-June-15-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table POST
--------------------------------------------------------

  CREATE TABLE "AGUS"."POST" 
   (	"ID" VARCHAR2(20 CHAR), 
	"TITLE" VARCHAR2(100 CHAR), 
	"CONTENT" VARCHAR2(100 CHAR), 
	"TAGS" VARCHAR2(100 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into AGUS.POST
Insert into AGUS.POST (ID,TITLE,CONTENT,TAGS) values ('1','MUSIC','SLOW','SINGLE');
Insert into AGUS.POST (ID,TITLE,CONTENT,TAGS) values ('2','MUSIC','ROCK','SINGLE');
--------------------------------------------------------
--  Constraints for Table POST
--------------------------------------------------------

  ALTER TABLE "AGUS"."POST" MODIFY ("ID" NOT NULL ENABLE);
