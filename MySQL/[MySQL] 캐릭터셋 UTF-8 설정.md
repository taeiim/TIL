# [MySQL] 캐릭터셋 UTF-8 설정

## Charater set 이란

Character set은 사용하는 언어를 표현하기 위한 문자들의 집합을 의미한다.

한글을 표현하기 위해 사용하는 캐릭터 셋은 여러가지가 존재한다.



일반적으로 MySQL을 처음 설치하면 언어설정이 latin1 로 되어있다.

Latin1은 기본 8비트(1바이트) 지원이기 때문에 한글(2바이트) 저장시 깨져서 저장된다.

저장할 때 깨져서 저장되기 때문에 출력할 때 당연히 깨진 값이 그대로 전송된다.



UTF-8로 캐릭터셋을 설정해서 한글 깨짐 현상을 해결하자.



## 캐릭터셋 설정하기

### 1.현재 캐릭터셋 알아보기

현재 캐릭터셋을 알아보는 방법에는 2가지가 있다.

#### 1) status 사용

```Mysql
mysql> status
--------------
./mysql  Ver 14.14 Distrib 5.7.18, for macos10.12 (x86_64) using  EditLine wrapper

Connection id:		5
Current database:	
Current user:		root@localhost
SSL:			Not in use
Current pager:		stdout
Using outfile:		''
Using delimiter:	;
Server version:		5.7.18 MySQL Community Server (GPL)
Protocol version:	10
Connection:		Localhost via UNIX socket
Server characterset:	latin1
Db     characterset:	latin1
Client characterset:	utf8
Conn.  characterset:	utf8
UNIX socket:		/tmp/mysql.sock
Uptime:			7 hours 35 min 57 sec

Threads: 1  Questions: 7  Slow queries: 0  Opens: 105  Flush tables: 1  Open tables: 98  Queries per second avg: 0.000
--------------
```

 **status** 명령어를 사용해서 간단히 지금 캐릭터셋을 확인할 수 있다.

Server characterset:	latin1
Db     characterset:	latin1
Client characterset:	utf8
Conn.  characterset:	utf8

여기 부분을 확인하면 된다.



#### 2) show variables 사용

```mysql
mysql> show variables like 'char%';

+--------------------------+-----------------------------------------------------------+
| Variable_name            | Value                                                     |
+--------------------------+-----------------------------------------------------------+
| character_set_client     | utf8                                                      |
| character_set_connection | utf8                                                      |
| character_set_database   | latin1                                                    |
| character_set_filesystem | binary                                                    |
| character_set_results    | utf8                                                      |
| character_set_server     | latin1                                                    |
| character_set_system     | utf8                                                      |
| character_sets_dir       | /usr/local/mysql-5.7.18-macos10.12-x86_64/share/charsets/ |
+--------------------------+-----------------------------------------------------------+
8 rows in set (0.01 sec)

```

**show variables like 'char%';** 을 이용해서 확인할 수 있다.



### 2. 캐릭터셋 추가

```mysql
$ cd /usr/local/mysql
$ sudo vi my.cnf
```

mysql의 디폴트 설정 파일은 /etc/my.cnf에 있다. 

이 두줄을 치면 패스워드를 입력하라고 하는데 패스워드를 입력하고 접속하면 된다



설정해야 할 부분은 client, mysqId, mysqldump, mysql 이다.

아래와 같이 설정해준다.

```mysql
[client]
default-character-set = utf8

[mysqld]
init_connect = SET collation_connection = utf8_general_ci  
init_connect = SET NAMES utf8  
#default-character-set = utf8
character-set-server = utf8  
collation-server = utf8_general_ci

[mysqldump]
default-character-set = utf8

[mysql]
default-character-set = utf8
```



### 3. 확인해보자

1. 번으로 돌아가서 현재 캐릭터셋을 확인해보면 utf8로 되어있을 것이다.

이제 끝이다!!!