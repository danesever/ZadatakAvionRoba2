package zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;

public class Zadatak1KreiranjeTabela {
    public static void main(String[] args) {
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new
                    JdbcConnectionSource("jdbc:sqlite:avionRoba.db");

        } catch (Exception e) {

        } finally {

            try {
                connectionSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    }

