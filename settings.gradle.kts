rootProject.name = "plugins"

include(
    "SillyCMDs"
)

rootProject.children.forEach {
    it.projectDir = file("plugins/kotlin/${it.name}")
}
