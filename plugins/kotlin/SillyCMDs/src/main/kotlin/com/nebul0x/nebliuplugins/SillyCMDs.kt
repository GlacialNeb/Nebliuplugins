package com.nebul0x.nebliuplugins

import android.content.Context
import com.aliucord.Utils
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.api.CommandsAPI
import com.aliucord.entities.Plugin
import com.discord.api.commands.ApplicationCommandType
import com.discord.api.commands.CommandChoice

@AliucordPlugin(requiresRestart = false)

class SillyCMDs : Plugin() {
    override fun start(context: Context) {
        val optionsList = listOf(
            Utils.createCommandOption(ApplicationCommandType.STRING, "copypasta", "Chosen copypasta.", null, required = true, default = true, channelTypes = emptyList(), choices = listOf(CommandChoice("vaporeon", "vaporeon"), CommandChoice("catgirlshelter", "catgirlshelter"))),
            Utils.createCommandOption(ApplicationCommandType.STRING, "visibility", "Sent to chat?", null, required = false, default = false, channelTypes = emptyList(), choices = listOf(CommandChoice("yes", "y"), CommandChoice("no", "n")))
        )

        commands.registerCommand("copypasta", "Select a copypasta to send from a library!", optionsList)
        { ctx ->
            val str = ctx.getStringOrDefault("visibility", "true")
            val choseCopypasta = ctx.getStringOrDefault("copypasta", "None selected!")

            if (choseCopypasta == "vaporeon") {
                choseCopypasta = "Hey guys, did you know that in terms of male human and female Pokémon breeding, Vaporeon is the most compatible Pokémon for humans? Not only are they in the field egg group, which is mostly comprised of mammals, Vaporeon are an average of 3”03' tall and 63.9 pounds, this means they're large enough to be able handle human dicks, and with their impressive Base Stats for HP and access to Acid Armor, you can be rough with one. Due to their mostly water based biology, there's no doubt in my mind that an aroused Vaporeon would be incredibly wet, so wet that you could easily have sex with one for hours without getting sore. They can also learn the moves Attract, Baby-Doll Eyes, Captivate, Charm, and Tail Whip, along with not having fur to hide nipples, so it'd be incredibly easy for one to get you in the mood. With their abilities Water Absorb and Hydration, they can easily recover from fatigue with enough water. No other Pokémon comes close to this level of compatibility. Also, fun fact, if you pull out enough, you can make your Vaporeon turn white. Vaporeon is literally built for human dick. Ungodly defense stat+high HP pool+Acid Armor means it can take cock all day, all shapes and sizes and still come for more"
            } else if (choseCopypasta == "catgirlshelter") {
                choseCopypasta = """
                    If catgirl shelters were real I would run in naked and start furiously beating off into their faces while they made r-slurred marshy noises like "Nyoo~ Nyaat the frick~ Putyaa your peepee awaay meow!!"
                """.trimIndent()
            }

            CommandsAPI.CommandResult(
                choseCopypasta
                null,
                str == "y" && choseCopypasta != "None selected!"
            )
        }
    }

    override fun stop(context: Context) {
        commands.unregisterAll()
    }
}