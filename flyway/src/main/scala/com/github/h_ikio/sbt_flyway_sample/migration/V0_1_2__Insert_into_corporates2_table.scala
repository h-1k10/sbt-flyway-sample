package com.github.h_ikio.sbt_flyway_sample.migration

import java.sql.Connection

import org.flywaydb.core.api.migration.jdbc.JdbcMigration
import scalikejdbc._

class V0_1_2__Insert_into_corporates2_table extends JdbcMigration {
  override def migrate(connection: Connection): Unit = {
    DB(connection) withinTx { implicit session =>
      sql"INSERT INTO flyway_sample.CORPORATES (corporate_id, corporate_name) values (2, 'dummy corporate2')".update.apply()
    }
  }
}
