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
        commands.registerCommand(
            "copypasta",
            "Select a copypasta to send from a library!",
            Utils.createCommandOption(ApplicationCommandType.STRING, "copypasta", "Chosen copypasta.", null, required = true, default = true, channelTypes = emptyList(), choices = listOf(
                CommandChoice("vaporeon", "vaporeon"),
                CommandChoice("catgirlshelter", "catgirlshelter"),
                CommandChoice("raidshadowlegends", "raidshadowlegends"),
                CommandChoice("npestakenos", "npestakenos"),
                CommandChoice("oopsiewoopsie", "oopsiewoopsie"),
                CommandChoice("shitposting", "shitposting"),
                CommandChoice("copypastarap", "copypastarap"),
                CommandChoice("ihop", "ihop")
            ))
        ) { ctx ->
            //val str = ctx.getStringOrDefault("visibility", "true")
            var choseCopypasta = ctx.getStringOrDefault("copypasta", "None selected!")

            if (choseCopypasta == "vaporeon") {
                choseCopypasta = """
                    Hey guys, did you know that in terms of male human and female Pokémon breeding, Vaporeon is the most compatible Pokémon for humans? Not only are they in the field egg group, which is mostly comprised of mammals, Vaporeon are an average of 3”03' tall and 63.9 pounds, this means they're large enough to be able handle human dicks, and with their impressive Base Stats for HP and access to Acid Armor, you can be rough with one. Due to their mostly water based biology, there's no doubt in my mind that an aroused Vaporeon would be incredibly wet, so wet that you could easily have sex with one for hours without getting sore. They can also learn the moves Attract, Baby-Doll Eyes, Captivate, Charm, and Tail Whip, along with not having fur to hide nipples, so it'd be incredibly easy for one to get you in the mood. With their abilities Water Absorb and Hydration, they can easily recover from fatigue with enough water. No other Pokémon comes close to this level of compatibility. Also, fun fact, if you pull out enough, you can make your Vaporeon turn white. Vaporeon is literally built for human dick. Ungodly defense stat+high HP pool+Acid Armor means it can take cock all day, all shapes and sizes and still come for more
                """.trimIndent()
            } else if (choseCopypasta == "catgirlshelter") {
                choseCopypasta = """
                    If catgirl shelters were real I would run in naked and start furiously beating off into their faces while they made r-slurred marshy noises like "Nyoo~ Nyaat the frick~ Putyaa your peepee awaay meow!!"
                """.trimIndent()
            } else if (choseCopypasta == "raidshadowlegends") {
                choseCopypasta = """
                    RAID: Shadow Legends™️ is an immersive online experience with everything you'd expect from a brand new RPG title. It's got an amazing storyline, awesome 3D graphics, giant boss fights, PVP battles, and hundreds of never before seen champions to collect and customize. I never expected to get this level of performance out of a mobile game. Look how crazy the level of detail is on these champions! RAID: Shadow Legends™️ is getting big real fast, so you should definitely get in early. Starting now will give you a huge head start. There's also an upcoming Special Launch Tournament with crazy prizes! And not to mention, this game is absolutely free! So go ahead and check out the video description to find out more about RAID: Shadow Legends™️. There, you will find a link to the store page and a special code to unlock all sorts of goodies. Using the special code, you can get 50,000 Silver immediately, and a FREE Epic Level Champion as part of the new players program, courtesy of course of the RAID: Shadow Legends™️ devs
                """.trimIndent()
            } else if (choseCopypasta == "npestakenos") {
                choseCopypasta = """
                    OH MY GOD!!! *hyperventilates in disbelief* OH MY GOD YEEEEEEEEEESSSSS!!! YES! YES! YES! YES! *sobbing* Oh my god, oh my god, oh my god, oh my god, oh my god, oh my, oh my god, oh my god, oh my god, oh my god, oh my god i did it! Oh my god, oh my god, oh my god! *intense sobbing* Oh my god, oh my god, i did it! Oh my god, oh my god! *even more intense sobbing*
                """.trimIndent()
            } else if (choseCopypasta == "oopsiewoopsie") {
                choseCopypasta = """
                    OOPSIE WOOPSIE!! Uwu We make a fucky wucky!! A wittle fucko boingo! The code monkeys at our headquarters are working VEWY HAWD to fix this!
                """.trimIndent()
            } else if (choseCopypasta == "shitposting") {
                choseCopypasta = """
                    Is that all you shitposting fucks can say?!? Duurrhhlll... Based, based, cringe, cringe, based, based, cringe, cringe, cringe, based, cringe... I feel like I'm in a FUCKING asylum full of dementia-ridden old people that can do nothing but repeat the same FUCKING words on loop like a fucking broken record!!! Cringe cringe cringe cringe!!! Cringe, based, based! Onions? Onions, SNOYY!! Onions L O L onions! Cringe, BOOMER?? Le zoomer, I am BOOMER!!! No zoom zoom zoomies!! Zoomer going zoomies!! YnnnggGGHHAAHH I..FUCKING hate the internet so god DAMN much... FUCK! Shitposting, honest to...god...fucking hope your mother CHOKES on her own feces in hell you...COCK SUCKER. But oooooooooohhhhhhhhhhhh I know my post is CRINGE!! ISN'T IT??? Cringe, cringe, CRINGEY cringe, based, cringe, based, REDDIT?? CRINGE!! BASED? CRINGE!! ZOOM?? CRINGE!! ONIONS?? REDDIT, BASED....BASED!! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                """.trimIndent()
            } else if (choseCopypasta == "copypastarap") {
                choseCopypasta = """
                    Okay, I know this is a really bad idea but,
                    I'm already here so,
                    Here we fucking go

                    rawr
                    x3 nuzzles! pounces on u,
                    uwu
                    u so warm.

                    couldn't help but ur bulge from across the floor,
                    nuzzlez yo' necky~ murr~ hehe
                    unzips yo baggy ass pants,
                    oof baby u so musky

                    take me home, pet me, N' make me yours
                    & dont forget to stuff me!
                    see me wag my widdle baby tail,
                    all for your bolgy-wolgy!

                    kisses n lickies yo neck,
                    i hope daddy likeies
                    nuzzles n wuzzles yo chest,
                    i be gettin thirsty

                    hey i got a lil itch,
                    u think u can help me?
                    only seven inches long
                    uwu
                    PLS ADOPT ME

                    paws on ur bulge as i lick my lips
                    (uwu punish me pls)
                    bout hit'em with this furry shit
                    (he don't see it comin)
                """.trimIndent()
            } else if (choseCopypasta == "ihop") {
                choseCopypasta = """
                    No! I will not give you a maple syrup footjob under the ihop table
                """.trimIndent()
            } else if (choseCopypasta == "wafflehouse") {
                choseCopypasta = """
                    The Waffle House Has Found Its New Host
                """.trimIndent()
            }

            CommandsAPI.CommandResult(
                choseCopypasta,
                null,
                true && choseCopypasta != "None selected!" //str == "y" && choseCopypasta != "None selected!"
            )
        }
    }

    override fun stop(context: Context) {
        commands.unregisterAll()
    }
}

//Utils.createCommandOption(ApplicationCommandType.STRING, "visibility", "Sent to chat?", null, required = false, default = false, channelTypes = emptyList(), choices = listOf(CommandChoice("yes", "y"), CommandChoice("no", "n")))