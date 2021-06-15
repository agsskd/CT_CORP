--------------------------------------------------------
--  File created - Tuesday-June-15-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TAG
--------------------------------------------------------

  CREATE TABLE "AGUS"."TAG" 
   (	"ID" VARCHAR2(20 CHAR), 
	"LABEL" VARCHAR2(100 CHAR), 
	"POSTS" VARCHAR2(100 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into AGUS.TAG
Insert into AGUS.TAG (ID,LABEL,POSTS) values ('1','SONY','SINGLE');
Insert into AGUS.TAG (ID,LABEL,POSTS) values ('2','MUG','SINGLE');
Insert into AGUS.TAG (ID,LABEL,POSTS) values ('3','MUSICA','DUO');
--------------------------------------------------------
--  Constraints for Table TAG
--------------------------------------------------------

  ALTER TABLE "AGUS"."TAG" MODIFY ("ID" NOT NULL ENABLE);
