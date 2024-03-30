package org.server.model;

import java.sql.Connection;
import java.sql.SQLException;

interface DatabaseConnection {
    Connection getConnection() throws SQLException;

    void closeConnection(Connection connection);
}

interface QueryExecutorSelect {
    Object[] executeQuery(String query, String valueColumn) throws SQLException;

}

interface QueryExecutorInsert {
    void executeInsert(String query) throws SQLException;
}