package com.incorps.theavengersheroes

object AvengersData {

    private val avengersNames = arrayOf(
        "Doctor Strange",
        "Scarlet Witch",
        "Vision",
        "Ant-Man",
        "Captain America",
        "Winter Soldier",
        "Hawkeye",
        "Black Widow",
        "Hulk",
        "Thor",
        "Iron Man",
        "Spider-Man",
        "Black Panther"
    )

    private val avengersDetails = arrayOf(
        "Doctor Stephen Vincent Strange M.D., Ph.D is the sorcerer and a Master of the Mystic Arts. Originally a brilliant, although arrogant, neurosurgeon, Strange got into a car accident which resulted with his hands becoming crippled. When all Western medicine failed him, Strange embarked on a journey that led him into Kamar-Taj where Strange had made the discovery of magic and alternate dimensions, being trained by the Ancient One. Though focused on healing his hands and returning into his career, Strange learned more of the mystic arts and helped the Masters prevent Kaecilius from merging the Earth with the Dark Dimension, but not before witnessing the Ancient One's death. Following the demise of their mentor, Strange became the protector of the New York Sanctum in New York as well as the Earth's protector from any new inter-dimensional threats.",
        "Wanda Maximoff, also known as Scarlet Witch, is a native of Sokovia who grew up with her fraternal twin brother, Pietro. Born with the latent magical ability to harness Chaos Magic, she developed a hatred against Tony Stark and rallied anti-American protests after the Novi Grad Bombings killed her parents. Years later, in an effort to help purge their country of strife, the twins joined HYDRA and agreed to undergo experiments with the Scepter under the supervision of Wolfgang von Strucker, with the Mind Stone awakening and amplifying her abilities. While her brother developed super-speed, Wanda attained various psionic abilities. When HYDRA fell, the twins joined Ultron to get their revenge on Stark, but abandoned him when they discovered Ultron's true intentions to eradicate humanity. Wanda and Pietro joined the Avengers during the Battle of Sokovia to stop Ultron; Pietro was killed during the battle but Wanda survived, and shortly after relocated to the New Avengers Facility in the United States.",
        "Vision was a synthezoid made from vibranium, created by Ultron with the help of Helen Cho, and given life by the powerful artifact known as the Mind Stone. Originally conceived as the perfect form for Ultron, the body was taken by the Avengers before Tony Stark and Bruce Banner proceeded to upload the remnants of Stark's personal A.I. J.A.R.V.I.S. into it. Upon his birth, Vision declared he was neither Ultron nor J.A.R.V.I.S., but one that would fight with them to protect humanity. Vision had then joined with the Avengers in the Battle of Sokovia, using his powers to prevent Ultron from transferring his consciousness to the internet, and allowing the Avengers to successfully put an end to his plan.",
        "Scott Edward Harris Lang is a former convicted thief who was struggling to pay child support to his estranged wife for visitation rights to his daughter, Cassie Lang. With the promise of money, he was convinced by Hank Pym to take on the mantle of Ant-Man: a superhero with an advanced suit designed to shrink its wearer to a tiny size while increasing one's toughness, agility, and physical strength. Trained under both Hank and his daughter Hope van Dyne, Lang was to help foil Hank's former protege Darren Cross, who was intending to sell his Yellowjacket Suit design and his copy of the Pym Particles formula to HYDRA and the Ten Rings. However, their plan was discovered by Cross, culminating in a final fight between Cross and Ant-Man. To defeat Cross, Lang had to shrink small enough to enter Cross' Yellowjacket suit and destroy it, sending Lang to the Quantum Realm, but Lang was able to escape. Lang's heroism helped restore his relationship with Cassie and his ex-wife, as well as find a new romantic one with Hope. Lang soon learned that the Avengers were seeking to recruit him.",
        "Samuel Thomas \"Sam\" Wilson is a former United States Air Force pararescue airman, who left active duty when his wing-man Riley died during combat, instead choosing to help other veterans suffering from post-traumatic stress disorder. At this time, Wilson had met Captain America and was drawn to his conflict with HYDRA, as Captain America needed help from anyone not associated with S.H.I.E.L.D. since they had been infiltrated by HYDRA. Retaking his title as the Falcon, Wilson had then assisted with destroying all of Alexander Pierce's schemes of world domination. Following their victory against Pierce's HYDRA units, Falcon then agreed to assist Captain America in tracking down the Winter Soldier, who was in fact Captain America's close friend who had been brainwashed.",
        "Sergeant James Buchanan \"Bucky\" Barnes is a World War II veteran, a former officer of the 107th Infantry Regiment and best friend of Steve Rogers since childhood. Barnes enlisted in the army and assigned to the 107th in 1943. His regiment was captured by HYDRA, where Barnes was given a variant of the Super Soldier Serum by Arnim Zola. Barnes, along with whoever still remained from his regiment, was later rescued by Rogers, who had become Captain America during Barnes' absence. Upon joining forces with the continuing war, Barnes and Rogers formed their Howling Commandos, to battle Red Skull's forces. However, during their attempt to finally capture Zola, in the Austrian Alps, Barnes was caught in their ambush and plummeted hundreds of feet from a train. As no body was ever recovered, Barnes had then been presumed deceased.",
        "Clinton Francis \"Clint\" Barton, also known as Hawkeye, is a skilled marksman, a former special agent of S.H.I.E.L.D. and one of the founding members of the Avengers. Known for his use of the bow and arrow as his primary weapon, Barton had become one of the best agents of S.H.I.E.L.D., responsible for the recruitment of Black Widow, whom he developed a strong friendship with. Assigned by Nick Fury into watching over the Tesseract, he was brainwashed by Loki and used as his pawn for all his evil schemes. However, following their Attack on the Helicarrier, he was freed from Loki's mental controls by Black Widow and joined the Avengers to fight against Loki's Chitauri army in the Battle of New York, ending Loki's Invasion, before Hawkeye had returned to his work as a S.H.I.E.L.D. agent.",
        "Natalia Alianovna \"Natasha\" Romanoff (Russian: Наталья Алиановна \"Наташа\" Романова), also known as Black Widow, was one of the most talented spies and assassins in the entire world and a founding member of the Avengers. Originally a KGB operative and dangerous assassin, Romanoff was recruited into S.H.I.E.L.D. by Clint Barton. Having extensive mastery in martial arts and armed with her Widow's Bite, Black Widow became one of S.H.I.E.L.D.'s most efficient agents. During one mission, she was sent undercover into Stark Industries to watch Tony Stark due to the fear that he was dying. During this mission, Romanoff assisted Stark with defeating Ivan Vanko's terrorist plots against him.",
        "Doctor Robert Bruce Banner, M.D., Ph.D., is a renowned scientist and a founding member of the Avengers. Highly respected for his work in biochemistry, nuclear physics, and gamma radiation, he was commissioned by Thaddeus Ross to recreate the Super Soldier Serum which created Captain America, although Ross elected not to inform Banner what he was creating. However, when an exposure to high levels of gamma radiation instead of vita radiation went awry, the mild-mannered scientist had found that when angered, provoked or excited, he would transform into the huge, rage-fueled, nearly mindless creature known as Hulk.",
        "Thor Odinson is the Asgardian God of Thunder, the former king of Asgard and New Asgard, and a founding member of the Avengers. When his irresponsible and impetuous behavior reignited a conflict between Asgard and Jotunheim, Thor was denied the right to become king, stripped of his power, and banished to Earth by Odin. While exiled on Earth, Thor learned humility, finding love with Jane Foster, and helped save his new friends from the Destroyer sent by Loki. Due to his selfless act of sacrifice, Thor redeemed himself in his father's eyes and was granted his power once more, which he then used to defeat Loki's schemes of genocide.",
        "Anthony Edward \"Tony\" Stark was a billionaire industrialist, a founding member of the Avengers, and the former CEO of Stark Industries. A brash but brilliant inventor, Stark was self-described as a genius, billionaire, playboy, and philanthropist. With his great wealth and exceptional technical knowledge, Stark was one of the world's most powerful men following the deaths of his parents and enjoyed the playboy lifestyle for many years until he was kidnapped by the Ten Rings in Afghanistan, while demonstrating a fleet of Jericho missiles. With his life on the line, Stark created an armored suit which he used to escape his captors. Upon returning home, he utilized several more armors to use against terrorists, as well as Obadiah Stane who turned against Stark. Stark enjoyed the fame that came with his new secret identity and decided to share it with the world, publicly revealing himself as Iron Man.",
        "Peter Benjamin Parker is a high school student who gained spider-like abilities, fighting crime across New York City as the alter ego Spider-Man, hoping someday, he will live up to his heroes in the Avengers. While Parker juggled all his continued superhero duties with the demands of his high-school life, he was approached by Tony Stark who recruited Spider-Man to join the Avengers Civil War, putting Spider-Man into the brief conflict with his personal hero, Captain America. Parker then agreed and was given his new suit as well as brand new Stark technology in exchange for all his help, although Stark still did not make him an official member of the Avengers and instead returned Parker back home to continue his own hero work.",
        "T'Challa is the King of Wakanda and the eldest child of T'Chaka and Ramonda. As the Wakandan monarch, he became the holder of the Black Panther mantle. Following the death of his father in the bombing attack orchestrated by Helmut Zemo, T'Challa had set out to kill the Winter Soldier, who was widely believed to be responsible for the attack. During his attempt to find the Winter Soldier, Black Panther had joined a Civil War between the Avengers, where he sided with Iron Man. However, Black Panther eventually learned that Zemo was really the one who had been responsible for his father's demise, as he captured Zemo, handing him over to Everett Ross, while he also vowed never to allow desires of vengeance to consume him again."
    )

    private val avengersImages = intArrayOf(
        R.drawable.doctor_strange,
        R.drawable.scarlet_witch,
        R.drawable.vision,
        R.drawable.antman,
        R.drawable.captain_america,
        R.drawable.winter_soldier,
        R.drawable.hawkeye,
        R.drawable.black_widow,
        R.drawable.hulk,
        R.drawable.thor,
        R.drawable.iron_man,
        R.drawable.spiderman,
        R.drawable.black_panther
    )

    val listData: ArrayList<Avengers>
        get() {
            val list = arrayListOf<Avengers>()
            for (position in avengersNames.indices) {
                val avengers = Avengers()
                avengers.name = avengersNames[position]
                avengers.detail = avengersDetails[position]
                avengers.photo = avengersImages[position]
                list.add(avengers)
            }
            return list
        }

}
