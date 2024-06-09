package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ZendikarRisingCommander extends ExpansionSet {

    private static final ZendikarRisingCommander instance = new ZendikarRisingCommander();

    public static ZendikarRisingCommander getInstance() {
        return instance;
    }

    private ZendikarRisingCommander() {
        super("Zendikar Rising Commander", "ZNC", ExpansionSet.buildDate(2020, 9, 25), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abundance", 58, Rarity.RARE, mage.cards.a.Abundance.class));
        cards.add(new SetCardInfo("Abzan Falconer", 9, Rarity.UNCOMMON, mage.cards.a.AbzanFalconer.class));
        cards.add(new SetCardInfo("Acidic Slime", 59, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Admonition Angel", 10, Rarity.MYTHIC, mage.cards.a.AdmonitionAngel.class));
        cards.add(new SetCardInfo("Aetherize", 23, Rarity.UNCOMMON, mage.cards.a.Aetherize.class));
        cards.add(new SetCardInfo("Anowon, the Ruin Thief", 1, Rarity.MYTHIC, mage.cards.a.AnowonTheRuinThief.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Anowon, the Ruin Thief", 7, Rarity.MYTHIC, mage.cards.a.AnowonTheRuinThief.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Arcane Signet", 106, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Armorcraft Judge", 60, Rarity.UNCOMMON, mage.cards.a.ArmorcraftJudge.class));
        cards.add(new SetCardInfo("Banishing Light", 11, Rarity.UNCOMMON, mage.cards.b.BanishingLight.class));
        cards.add(new SetCardInfo("Beanstalk Giant", 61, Rarity.UNCOMMON, mage.cards.b.BeanstalkGiant.class));
        cards.add(new SetCardInfo("Blackblade Reforged", 107, Rarity.RARE, mage.cards.b.BlackbladeReforged.class));
        cards.add(new SetCardInfo("Blighted Woodland", 121, Rarity.UNCOMMON, mage.cards.b.BlightedWoodland.class));
        cards.add(new SetCardInfo("Bonehoard", 108, Rarity.RARE, mage.cards.b.Bonehoard.class));
        cards.add(new SetCardInfo("Boros Garrison", 122, Rarity.UNCOMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Guildgate", 123, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Changeling Outcast", 40, Rarity.COMMON, mage.cards.c.ChangelingOutcast.class));
        cards.add(new SetCardInfo("Circuitous Route", 62, Rarity.UNCOMMON, mage.cards.c.CircuitousRoute.class));
        cards.add(new SetCardInfo("Command Tower", 124, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 109, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Condemn", 12, Rarity.UNCOMMON, mage.cards.c.Condemn.class));
        cards.add(new SetCardInfo("Consuming Aberration", 89, Rarity.RARE, mage.cards.c.ConsumingAberration.class));
        cards.add(new SetCardInfo("Crush Contraband", 13, Rarity.UNCOMMON, mage.cards.c.CrushContraband.class));
        cards.add(new SetCardInfo("Cryptic Caves", 125, Rarity.UNCOMMON, mage.cards.c.CrypticCaves.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 126, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Guildgate", 127, Rarity.COMMON, mage.cards.d.DimirGuildgate.class));
        cards.add(new SetCardInfo("Dimir Keyrune", 110, Rarity.UNCOMMON, mage.cards.d.DimirKeyrune.class));
        cards.add(new SetCardInfo("Dimir Locket", 111, Rarity.COMMON, mage.cards.d.DimirLocket.class));
        cards.add(new SetCardInfo("Dimir Signet", 112, Rarity.COMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Dismal Backwater", 128, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Distant Melody", 24, Rarity.COMMON, mage.cards.d.DistantMelody.class));
        cards.add(new SetCardInfo("Elite Scaleguard", 14, Rarity.UNCOMMON, mage.cards.e.EliteScaleguard.class));
        cards.add(new SetCardInfo("Elvish Rejuvenator", 63, Rarity.COMMON, mage.cards.e.ElvishRejuvenator.class));
        cards.add(new SetCardInfo("Embodiment of Insight", 64, Rarity.UNCOMMON, mage.cards.e.EmbodimentOfInsight.class));
        cards.add(new SetCardInfo("Emeria Angel", 15, Rarity.RARE, mage.cards.e.EmeriaAngel.class));
        cards.add(new SetCardInfo("Emeria Shepherd", 16, Rarity.RARE, mage.cards.e.EmeriaShepherd.class));
        cards.add(new SetCardInfo("Endless Obedience", 41, Rarity.UNCOMMON, mage.cards.e.EndlessObedience.class));
        cards.add(new SetCardInfo("Enigma Thief", 4, Rarity.RARE, mage.cards.e.EnigmaThief.class));
        cards.add(new SetCardInfo("Evolution Sage", 65, Rarity.UNCOMMON, mage.cards.e.EvolutionSage.class));
        cards.add(new SetCardInfo("Evolving Wilds", 129, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Extract from Darkness", 90, Rarity.UNCOMMON, mage.cards.e.ExtractFromDarkness.class));
        cards.add(new SetCardInfo("Fact or Fiction", 25, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faerie Vandal", 26, Rarity.UNCOMMON, mage.cards.f.FaerieVandal.class));
        cards.add(new SetCardInfo("Far Wanderings", 66, Rarity.COMMON, mage.cards.f.FarWanderings.class));
        cards.add(new SetCardInfo("Fated Return", 42, Rarity.RARE, mage.cards.f.FatedReturn.class));
        cards.add(new SetCardInfo("Fertilid", 67, Rarity.COMMON, mage.cards.f.Fertilid.class));
        cards.add(new SetCardInfo("Frogtosser Banneret", 43, Rarity.COMMON, mage.cards.f.FrogtosserBanneret.class));
        cards.add(new SetCardInfo("Geode Rager", 6, Rarity.RARE, mage.cards.g.GeodeRager.class));
        cards.add(new SetCardInfo("Gonti, Lord of Luxury", 44, Rarity.RARE, mage.cards.g.GontiLordOfLuxury.class));
        cards.add(new SetCardInfo("Ground Assault", 91, Rarity.UNCOMMON, mage.cards.g.GroundAssault.class));
        cards.add(new SetCardInfo("Gruul Guildgate", 130, Rarity.COMMON, mage.cards.g.GruulGuildgate.class));
        cards.add(new SetCardInfo("Gruul Turf", 131, Rarity.UNCOMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Harmonize", 68, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Harrow", 69, Rarity.COMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Heirloom Blade", 113, Rarity.UNCOMMON, mage.cards.h.HeirloomBlade.class));
        cards.add(new SetCardInfo("Hour of Revelation", 17, Rarity.RARE, mage.cards.h.HourOfRevelation.class));
        cards.add(new SetCardInfo("In Garruk's Wake", 45, Rarity.RARE, mage.cards.i.InGarruksWake.class));
        cards.add(new SetCardInfo("Inspiring Call", 70, Rarity.UNCOMMON, mage.cards.i.InspiringCall.class));
        cards.add(new SetCardInfo("Invisible Stalker", 27, Rarity.UNCOMMON, mage.cards.i.InvisibleStalker.class));
        cards.add(new SetCardInfo("Jungle Shrine", 132, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Jwar Isle Refuge", 133, Rarity.UNCOMMON, mage.cards.j.JwarIsleRefuge.class));
        cards.add(new SetCardInfo("Keeper of Fables", 71, Rarity.UNCOMMON, mage.cards.k.KeeperOfFables.class));
        cards.add(new SetCardInfo("Khalni Heart Expedition", 72, Rarity.COMMON, mage.cards.k.KhalniHeartExpedition.class));
        cards.add(new SetCardInfo("Kodama's Reach", 73, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kor Cartographer", 18, Rarity.COMMON, mage.cards.k.KorCartographer.class));
        cards.add(new SetCardInfo("Krosan Verge", 134, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Latchkey Faerie", 28, Rarity.COMMON, mage.cards.l.LatchkeyFaerie.class));
        cards.add(new SetCardInfo("Lazav, Dimir Mastermind", 92, Rarity.MYTHIC, mage.cards.l.LazavDimirMastermind.class));
        cards.add(new SetCardInfo("Living Twister", 93, Rarity.RARE, mage.cards.l.LivingTwister.class));
        cards.add(new SetCardInfo("Marang River Prowler", 29, Rarity.UNCOMMON, mage.cards.m.MarangRiverProwler.class));
        cards.add(new SetCardInfo("Marsh Flitter", 46, Rarity.UNCOMMON, mage.cards.m.MarshFlitter.class));
        cards.add(new SetCardInfo("Master Thief", 30, Rarity.UNCOMMON, mage.cards.m.MasterThief.class));
        cards.add(new SetCardInfo("Military Intelligence", 31, Rarity.UNCOMMON, mage.cards.m.MilitaryIntelligence.class));
        cards.add(new SetCardInfo("Mina and Denn, Wildborn", 94, Rarity.RARE, mage.cards.m.MinaAndDennWildborn.class));
        cards.add(new SetCardInfo("Mind Stone", 114, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Multani, Yavimaya's Avatar", 75, Rarity.MYTHIC, mage.cards.m.MultaniYavimayasAvatar.class));
        cards.add(new SetCardInfo("Murder", 47, Rarity.COMMON, mage.cards.m.Murder.class));
        cards.add(new SetCardInfo("Myriad Landscape", 135, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Naya Charm", 95, Rarity.UNCOMMON, mage.cards.n.NayaCharm.class));
        cards.add(new SetCardInfo("Naya Panorama", 136, Rarity.COMMON, mage.cards.n.NayaPanorama.class));
        cards.add(new SetCardInfo("Necromantic Selection", 48, Rarity.RARE, mage.cards.n.NecromanticSelection.class));
        cards.add(new SetCardInfo("Needle Spires", 137, Rarity.RARE, mage.cards.n.NeedleSpires.class));
        cards.add(new SetCardInfo("Nighthowler", 49, Rarity.RARE, mage.cards.n.Nighthowler.class));
        cards.add(new SetCardInfo("Nightveil Sprite", 32, Rarity.UNCOMMON, mage.cards.n.NightveilSprite.class));
        cards.add(new SetCardInfo("Nissa's Renewal", 76, Rarity.RARE, mage.cards.n.NissasRenewal.class));
        cards.add(new SetCardInfo("Notion Thief", 96, Rarity.RARE, mage.cards.n.NotionThief.class));
        cards.add(new SetCardInfo("Notorious Throng", 33, Rarity.RARE, mage.cards.n.NotoriousThrong.class));
        cards.add(new SetCardInfo("Obelisk of Urd", 115, Rarity.RARE, mage.cards.o.ObeliskOfUrd.class));
        cards.add(new SetCardInfo("Obuun, Mul Daya Ancestor", 2, Rarity.MYTHIC, mage.cards.o.ObuunMulDayaAncestor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Obuun, Mul Daya Ancestor", 8, Rarity.MYTHIC, mage.cards.o.ObuunMulDayaAncestor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ogre Slumlord", 50, Rarity.RARE, mage.cards.o.OgreSlumlord.class));
        cards.add(new SetCardInfo("Omnath, Locus of Rage", 97, Rarity.MYTHIC, mage.cards.o.OmnathLocusOfRage.class));
        cards.add(new SetCardInfo("Oona's Blackguard", 51, Rarity.UNCOMMON, mage.cards.o.OonasBlackguard.class));
        cards.add(new SetCardInfo("Oona, Queen of the Fae", 98, Rarity.RARE, mage.cards.o.OonaQueenOfTheFae.class));
        cards.add(new SetCardInfo("Open into Wonder", 34, Rarity.UNCOMMON, mage.cards.o.OpenIntoWonder.class));
        cards.add(new SetCardInfo("Planar Outburst", 19, Rarity.RARE, mage.cards.p.PlanarOutburst.class));
        cards.add(new SetCardInfo("Price of Fame", 52, Rarity.UNCOMMON, mage.cards.p.PriceOfFame.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 77, Rarity.RARE, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Retreat to Emeria", 20, Rarity.UNCOMMON, mage.cards.r.RetreatToEmeria.class));
        cards.add(new SetCardInfo("Retreat to Kazandu", 78, Rarity.UNCOMMON, mage.cards.r.RetreatToKazandu.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 79, Rarity.RARE, mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Rise from the Grave", 53, Rarity.UNCOMMON, mage.cards.r.RiseFromTheGrave.class));
        cards.add(new SetCardInfo("Rites of Flourishing", 80, Rarity.RARE, mage.cards.r.RitesOfFlourishing.class));
        cards.add(new SetCardInfo("Rogue's Passage", 138, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Sandstone Oracle", 116, Rarity.UNCOMMON, mage.cards.s.SandstoneOracle.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 81, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Scaretiller", 117, Rarity.COMMON, mage.cards.s.Scaretiller.class));
        cards.add(new SetCardInfo("Scourge of Fleets", 35, Rarity.RARE, mage.cards.s.ScourgeOfFleets.class));
        cards.add(new SetCardInfo("Scytheclaw", 118, Rarity.RARE, mage.cards.s.Scytheclaw.class));
        cards.add(new SetCardInfo("Seer's Sundial", 119, Rarity.RARE, mage.cards.s.SeersSundial.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 139, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 140, Rarity.UNCOMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Sepulchral Primordial", 54, Rarity.RARE, mage.cards.s.SepulchralPrimordial.class));
        cards.add(new SetCardInfo("Silumgar's Command", 99, Rarity.RARE, mage.cards.s.SilumgarsCommand.class));
        cards.add(new SetCardInfo("Slither Blade", 36, Rarity.COMMON, mage.cards.s.SlitherBlade.class));
        cards.add(new SetCardInfo("Sol Ring", 120, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soul Manipulation", 100, Rarity.UNCOMMON, mage.cards.s.SoulManipulation.class));
        cards.add(new SetCardInfo("Spinal Embrace", 101, Rarity.RARE, mage.cards.s.SpinalEmbrace.class));
        cards.add(new SetCardInfo("Sporemound", 82, Rarity.COMMON, mage.cards.s.Sporemound.class));
        cards.add(new SetCardInfo("Springbloom Druid", 83, Rarity.COMMON, mage.cards.s.SpringbloomDruid.class));
        cards.add(new SetCardInfo("Stinkdrinker Bandit", 55, Rarity.UNCOMMON, mage.cards.s.StinkdrinkerBandit.class));
        cards.add(new SetCardInfo("Stolen Identity", 37, Rarity.RARE, mage.cards.s.StolenIdentity.class));
        cards.add(new SetCardInfo("Struggle // Survive", 102, Rarity.UNCOMMON, mage.cards.s.StruggleSurvive.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 141, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Sun Titan", 21, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sygg, River Cutthroat", 103, Rarity.RARE, mage.cards.s.SyggRiverCutthroat.class));
        cards.add(new SetCardInfo("Sylvan Advocate", 84, Rarity.RARE, mage.cards.s.SylvanAdvocate.class));
        cards.add(new SetCardInfo("Sylvan Reclamation", 104, Rarity.UNCOMMON, mage.cards.s.SylvanReclamation.class));
        cards.add(new SetCardInfo("Syr Konrad, the Grim", 56, Rarity.UNCOMMON, mage.cards.s.SyrKonradTheGrim.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 142, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("The Mending of Dominaria", 74, Rarity.RARE, mage.cards.t.TheMendingOfDominaria.class));
        cards.add(new SetCardInfo("Together Forever", 22, Rarity.RARE, mage.cards.t.TogetherForever.class));
        cards.add(new SetCardInfo("Treacherous Terrain", 105, Rarity.UNCOMMON, mage.cards.t.TreacherousTerrain.class));
        cards.add(new SetCardInfo("Triton Shorestalker", 38, Rarity.COMMON, mage.cards.t.TritonShorestalker.class));
        cards.add(new SetCardInfo("Trove Warden", 3, Rarity.RARE, mage.cards.t.TroveWarden.class));
        cards.add(new SetCardInfo("Tuskguard Captain", 85, Rarity.UNCOMMON, mage.cards.t.TuskguardCaptain.class));
        cards.add(new SetCardInfo("Waker of the Wilds", 86, Rarity.RARE, mage.cards.w.WakerOfTheWilds.class));
        cards.add(new SetCardInfo("Whirler Rogue", 39, Rarity.UNCOMMON, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Whispersteel Dagger", 5, Rarity.RARE, mage.cards.w.WhispersteelDagger.class));
        cards.add(new SetCardInfo("Yavimaya Elder", 87, Rarity.COMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Zendikar's Roil", 88, Rarity.UNCOMMON, mage.cards.z.ZendikarsRoil.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 57, Rarity.UNCOMMON, mage.cards.z.ZulaportCutthroat.class));
    }
}
