package io.quarkus.logging

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class LoggingRepository : PanacheRepository<LoggingEntity> {
    fun test() {
        Log.info("Hello from repository")
    }
}
