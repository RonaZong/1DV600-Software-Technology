public class VocabularyLibrary {
    //260 words
    private String[] library = {"acquiesce", "admonish", "advocate", "allege", "appoint", "arbitrary", "ascertain", "attitude", "audacious", "austere",
            "babbitt", "baboon", "beguile", "benevolent", "bequeath", "besiege", "bestow", "betrothed", "brook", "bulwark",
            "capricious", "cardinal", "chamber", "circumstances", "cohere", "comprehensive", "conscientious", "consecrate", "conspicuous", "convince",
            "decorum", "deference", "delicacy", "derived", "despair", "discreet", "dispatch", "disposition", "distinction", "dwell",
            "earnest", "edifice", "elaborate", "elude", "endow", "establish", "exalt", "exasperate", "exploit", "extravagant",
            "facile", "fare", "fathom", "fervent", "flourish", "forsake", "fortitude", "frontier", "frustrate", "furnish",
            "gabapentin", "gabardine", "gaunt", "generate", "gentry", "genuine", "gird", "grapple", "gravity", "gregarious",
            "haberdasher", "habiliment", "halting", "headlong", "heed", "horde", "humble", "humiliate", "hyperbole", "hypocrite",
            "ignominy", "illustrious", "incidental", "inclined", "indication", "infallible", "insurgent", "interminable", "intimate", "intrigue",
            "jabot", "jaded", "jackhammer", "jejune", "jingoism", "jinx", "jovial", "jocular", "justify", "juxtaposition",
            "kamikaze", "karma", "killjoy", "kindle", "kosher", "kowtow", "krill", "krypton", "kudos", "kvetch",
            "laconic", "lament", "languid", "latent", "league", "legitimate", "lethargic", "liaison", "livelihood", "luxuriant",
            "malice", "manifest", "maxim", "melancholy", "mitigate", "monetary", "morbid", "mortify", "muster", "myriad",
            "narcissism", "nascent", "nefarious", "nebulous", "neurotic", "niche", "nominal", "nostalgia", "notion", "notwithstanding",
            "obtrude", "odium", "oink", "ominous", "oppress", "ordain", "ostentatious", "ostensible", "outskirts", "oxymoron",
            "pacify", "partisan", "peremptory", "perish", "persist", "philosophical", "pious", "plead", "predecessor", "propriety",
            "quackery", "quaint", "quandary", "queasily", "querulous", "query", "quibble", "quirky", "quixotic", "quotidian",
            "ratify", "rebuke", "reflect", "reverie", "restrained", "retiring", "rhetoric", "ripple", "rout", "rudiment",
            "satire", "scarce", "scrupulous", "sentinel", "siege", "stipulate", "sublime", "substantial", "suffrage", "suspended",
            "taciturn", "tangible", "tarry", "tenacious", "tentative", "territory", "tract", "trepidation", "tribunal", "tout",
            "ubiquitous", "ultimatum", "umbrage", "uncanny", "upbraid", "upheaval", "urbanization", "usurp", "utopia", "utilitarian",
            "vacate", "vapid", "vassal", "venerable", "venture", "veritable", "vestige", "visage", "vivacious", "volatile",
            "wanton", "weary", "whimsical", "wistful", "wobble", "wondrous", "wrangle", "wrath", "wry", "wuss",
            "xanthemia", "xanthosis", "xenon", "xenophobia", "xenophobic", "xeroderma", "xerophile", "xylem", "xylene", "xylophone",
            "yarn", "yaw", "yearn", "yip", "yoke", "yonder", "yttrium", "ytterbium", "yuppie", "yurt",
            "zany", "zeal", "zealous", "zealot", "zenith", "ziggurat", "zoology", "zwieback", "zygotic", "zymurgy"};

    public String randomWords() {
        int index = (int)(Math.random() * 260);
        return library[0];
    }
}
