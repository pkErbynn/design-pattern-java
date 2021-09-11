package after;

class MysqlConnection implements IDbConnection {
    public int connect(){ return 1; }
}

interface IDbConnection {
    public int connect();
}

class DbManager {
    private IDbConnection dbConnection;

    DbManager(IDbConnection dbConnection) {  // lower level class loosely dependent via interface abstraction
        this.dbConnection = dbConnection;
    }
}