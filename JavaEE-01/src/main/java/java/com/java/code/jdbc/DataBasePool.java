package java.com.java.code.jdbc;
import com.zaxxer.hikari.HikariDataSource;
public class DataBasePool {

    private static  HikariDataSource hikariDataSource;

    public static HikariDataSource getHikariDataSource()
    {
        if(hikariDataSource!=null)
        {
            return hikariDataSource;
        }
        String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";
        synchronized (hikariDataSource){
        if(null==hikariDataSource){
            String driverName = "com.mysql.cj.jdbc.Driver";
            HikariConfig hikariConfig = new HikariConfig();
            hikariConfig.setUsername("root");
            hikariConfig.setPassword("2019");
            hikariConfig.setDriverClassName(driverName);
            hikariConfig.setJdbcUrl(url);
            hikariDataSource = new HikariDataSource(hikariConfig);
            return hikariDataSource;
            }
        }
    }

    public static void main(String args[])
    {
        while(true)
        {

        }
    }
}
