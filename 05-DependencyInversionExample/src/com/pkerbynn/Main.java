package com.pkerbynn;


class MysqlConnection {
    public int connect(){ return 1; }
}

 class DbManager {

    private MysqlConnection mysqlConnection;

    DbManager(MysqlConnection mysqlConnection) {    // lower level class tightly dependent
        this.mysqlConnection = mysqlConnection;
    }
}