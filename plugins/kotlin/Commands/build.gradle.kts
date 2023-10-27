version = "1.0.0" // Plugin version. Increment this to trigger the updater
description = "A plugin which has a variety of funny commands." // Plugin description that will be shown to user

aliucord {
    changelog.set("""
        Commands released!
    """.trimIndent())
    // changelogMedia.set("https://cool.png")
    // author("Name", 0)
    excludeFromUpdaterJson.set(false)
}
