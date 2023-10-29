package com.hardus.composeapp.model.fakedata

import com.hardus.composeapp.R
import com.hardus.composeapp.model.Troops

object FakeTroopsDataSource {
    val dummyTroops = listOf(
        Troops(
            1,
            R.drawable.barbarian,
            "Barbarian",
            20,
            "Barbarian adalah pasukan serangan jarak dekat di game yang terbuka di Barracks. Dia memiliki pedang dan menyerang bangunan terdekat, tetapi akan beralih target untuk melawan pasukan musuh jika mereka berada di dekatnya. Setelah pasukan musuh dikalahkan, Barbarian akan kembali menyerang bangunan terdekat. Dia digambarkan sebagai prajurit laki-laki dengan rambut pirang dan jambang panjang, dan terkenal karena kecenderungan destruktifnya."
        ),
        Troops(
            2,
            R.drawable.archer,
            "Archer",
            25,
            "Archer adalah pasukan jarak jauh yang dibuka dengan level 2 Barracks. Dia adalah pasukan jarak jauh pertama yang dibuka di Barracks, dan pasukan kedua secara keseluruhan yang dibuka di game. Archer adalah prajurit perempuan dengan mata tajam. Dia mengenakan gaun hijau muda pendek, mantel hooded, ikat pinggang kulit, dan tas kecil terpasang. Dia memiliki quiver yang dibawa di punggungnya, busur emas pendek di tangan kirinya, dan cincin emas di setiap lengan atasnya. Archer tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Heroes, atau Skeleton Trap skeletons (baik dengan diserang sendiri atau dengan berada di dekat pasukan teman yang diserang), dan bisa melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan justru melawan pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Archer akan melanjutkan menyerang bangunan terdekat."
        ),
        Troops(
            3,
            R.drawable.giant,
            "Giant",
            35,
            "Giant adalah pasukan yang terkunci ketiga di Barracks. Target pertama Giant adalah pertahanan, sehingga mereka pasukan yang ideal untuk dideploy untuk menghilangkan pertahanan dengan cepat. Namun, karena damage serangan mereka rendah, lebih baik menggunakan mereka dalam kelompok besar.\n" +
                    "Giant memprioritaskan struktur pertahanan di atas semua target lain, dan akan melewati semua jenis bangunan dan pasukan musuh lainnya sementara pertahanan masih ada di medan pertempuran. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeleton. Perhatikan bahwa seperti semua pasukan yang memprioritaskan pertahanan, Giant tidak menganggap Clan Castle sebagai pertahanan terlepas dari apakah atau tidak mengandung pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan dihancurkan, Giant menjadi seperti pasukan lainnya tanpa target yang dipilih; mereka akan menyerang bangunan terdekat dari mereka terlepas dari tipe, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di dekatnya dan dapat melawan mereka."
        ),
        Troops(
            4,
            R.drawable.goblin,
            "Goblin",
            15,
            "Goblin adalah pasukan yang terkunci keempat di Barracks.\n" +
                    "Goblin memprioritaskan bangunan sumber daya di atas semua target lain, dan akan melewati semua jenis bangunan dan pasukan musuh lainnya sementara bangunan sumber daya masih ada di medan pertempuran. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeleton. Perhatikan bahwa seperti semua pasukan yang memprioritaskan sumber daya, Goblin menganggap Clan Castle dan Town Hall sebagai bangunan sumber daya terlepas dari apakah atau tidak mengandung loot dan apakah atau tidak senjata Town Hall (jika ada) diaktifkan; Goblin akan memprioritaskan mereka selain menyebabkan kerusakan ganda pada mereka.\n" +
                    "Setelah semua bangunan sumber daya dihancurkan, Goblin menjadi seperti pasukan lainnya tanpa target yang dipilih; mereka akan menyerang bangunan terdekat dari mereka terlepas dari tipe, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di dekatnya dan dapat melawan mereka.\n" +
                    "Goblin menyebabkan kerusakan ganda pada bangunan sumber daya, (Town Halls dan Clan Castles, Gold Mines, Elixir Collectors, Dark Elixir Drills dan storages for each). Ini berarti ia menyebabkan lebih dari dua kali kerusakan yang sama seperti Barbarian dan tiga kali seperti Archer pada jenis bangunan ini. Imbalannya adalah kesehatannya yang relatif rendah, yang lebih tinggi daripada Archer tetapi lebih rendah daripada Barbarian.\n" +
                    "Karena sifat Goblin adalah menyerang bangunan sumber daya pertama, mereka bisa rentan terhadap serangan dan tidak sebaiknya dideploy tanpa pasukan jenis lain (seperti Giant atau Barbarian) sebagai meat shield.\n" +
                    "Goblin adalah salah satu unit darat tercepat di game. Kecepatannya memungkinkannya untuk kabur dari beberapa pertahanan dan trap, seperti Spring Trap."
        ),
        Troops(
            5,
            R.drawable.wall_breaker,
            "Wall Breaker",
            15,
            "Wall Breaker adalah pasukan yang terkunci kelima di Barracks. Sebagaimana namanya, Wall Breaker mengejar dinding, menyebabkan kerusakan besar pada dinding tersebut.\n" +
                    "Wall Breaker menyerang dengan mencari bangunan terlindungi (baca: dinding yang tertutup) terdekat dan menghancurkan Dinding perlindungannya, meledakkan dirinya dalam prosesnya. Ini menyebabkan splash damage di sekitar targetnya dan menyebabkan 40x kerusakan pada dinding.\n" +
                    "Wall Breaker memprioritaskan Dinding di atas semua target lain, dan akan mengabaikan seluruh bangunan atau pasukan musuh sementara bagian Dinding bahkan satu saja ada di medan pertempuran.\n" +
                    "Jika semua bagian Dinding dihancurkan, Wall Breaker menjadi seperti pasukan lainnya tanpa target yang dipilih; mereka akan menyerang bangunan terdekat dari mereka terlepas dari tipe, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di dekatnya dan dapat melawan mereka."
        ),
        Troops(
            6,
            R.drawable.balloon,
            "Balloon",
            40,
            "Balon adalah pasukan ke-enam yang terkunci di Barracks, dan merupakan unit udara pertama yang terkunci di Home Village, yang membutuhkan level 6 Barracks.\n" +
                    "Balon adalah Wall Breakers yang \"terpromosi\" yang sekarang menyerang dari balon udara panas. Mereka menjatuhkan bom ke tanah dengan splash damage area yang besar, yang dapat menghancurkan berbagai target darat, tetapi mudah dibasmi oleh bangunan anti-udara atau bangunan splash damage yang menargetkan udara (seperti Air Defense atau Wizard Tower).\n" +
                    "Balon memiliki damage tinggi untuk ruang pemukiman mereka, tetapi jarak dan rate serangan rendah. Mereka juga tidak bisa menyerang unit udara.\n" +
                    "Ketika mereka dikalahkan, Balon jatuh ke tanah dan meledak, menyebabkan kerusakan relatif kecil (dibandingkan dengan kerusakan bom mereka).\n" +
                    "Balon memprioritaskan struktur pertahanan di atas semua target lain, dan akan melewati semua jenis bangunan dan pasukan musuh lainnya sementara pertahanan masih ada di medan pertempuran. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeleton. Perhatikan bahwa seperti semua pasukan yang memprioritaskan pertahanan, Balon tidak menganggap Clan Castle sebagai pertahanan terlepas dari apakah atau tidak mengandung pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan dihancurkan, Balon menjadi seperti pasukan lainnya tanpa target yang dipilih; mereka akan menyerang bangunan terdekat dari mereka terlepas dari tipe, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di dekatnya dan dapat melawan mereka."
        ),
        Troops(
            7,
            R.drawable.wizard,
            "Wizard",
            25,
            "Wizard adalah pasukan yang terkunci di level 7 Barracks. Dia adalah unit darat rapuh dengan splash damage tinggi dan jarak.\n" +
                    "Wizard sering digunakan dalam kelompok besar untuk dukungan api atau sebagai pengali kekuatan (mirip dengan Archer), tetapi juga bisa efektif dalam jumlah yang lebih kecil, terutama pada level yang lebih rendah.\n" +
                    "Wizard tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Wizard akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            8,
            R.drawable.healer,
            "Healer",
            20,
            "Penyembuh adalah unit terbang yang terkunci di Barracks level 8, yang membutuhkan Town Hall level 6. Dia adalah satu-satunya pasukan yang tidak memiliki kemampuan menyerang, tetapi dapat menyembuhkan pasukan darat apa saja.\n" +
                    "Saat Penyembuh diluncurkan, aura lingkaran yang berdegup-degup muncul di sekitarnya. Dia akan menyembuhkan unit atau Pahlawan terdekat dari dirinya, terlepas dari seberapa rusak mereka. Misalnya, jika dia sudah mengunci Archer Queen Anda, dia tidak akan menyembuhkan apa pun lainnya sampai Archer Queen dihancurkan.\n" +
                    "Penyembuh tidak menyembuhkan unit udara (Penyembuh lain, Dragon, Balon, Minion, Lava Hounds, dll.), tidak seperti Healing Spell yang menyembuhkan setiap jenis pasukan. Penyembuh juga tidak akan mempengaruhi Siege Machines seperti Wall Wrecker.\n" +
                    "Perhatikan bahwa Penyembuh akan menyembuhkan pahlawan dengan tingkat yang terkurangi yang berbeda dengan unit lain; pertimbangkan ini saat menggunakan Penyembuh dengan pahlawan Anda.\n" +
                    "Penyembuh tidak bisa menyerang sama sekali. Mereka benar-benar tidak mampu mempertahankan diri, dan akan mengabaikan seluruh bangunan atau pasukan musuh yang menyerang mereka. Jika mereka tidak memiliki target untuk disembuhkan, mereka hanya akan tetap diam meskipun sedang mengalami kerusakan.\n" +
                    "Saat mempertahankan sebagai pasukan Clan Castle, dia menyembuhkan pasukan Clan Castle yang terluka, Pahlawan, dan Skeleton dari Skeleton Trap.\n" +
                    "Tidak seperti semua pasukan lain, Penyembuh diukur dalam penyembuhan per detik (disingkat sebagai HPS; dinyatakan dalam game sebagai \"Heal\"), bukan dalam kerusakan per detik.\n" +
                    "Setiap Penyembuh tambahan yang mempengaruhi unit yang sama setelah keempat akan memiliki efek yang terkurangi pada penyembuhan unit tersebut. Hanya sampai dengan tujuh Penyembuh yang dapat memiliki efek pada suatu unit pada satu waktu."
        ),
        Troops(
            9,
            R.drawable.dragon,
            "Dragon",
            50,
            "Dragon adalah pasukan yang terkunci di Barracks level 9, yang membutuhkan Town Hall level 7.\n" +
                    "Dia adalah unit terbang yang menakutkan yang mampu menyerang unit darat dan udara, dengan kesehatan dan kerusakan yang tinggi. Mirip dengan Wizard, serangan Dragon berjarak dan menyebabkan splash damage, dilihat saat menyerang pasukan musuh yang tumpang tindih atau di atas dinding.\n" +
                    "Dragon tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Dragon akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            10,
            R.drawable.pekka,
            "P.E.K.K.A",
            60,
            "P.E.K.K.A adalah unit besar yang terkunci di Barracks standar saat diperbarui ke level 10 yang membutuhkan Town Hall level 8. Dia adalah pasukan Elixir melee yang lambat dengan target tunggal yang menempati jumlah housing yang besar tetapi datang dengan jumlah hitpoints dan kerusakan yang besar. Dia adalah salah satu pasukan melee terkuat di game.\n" +
                    "P.E.K.K.A tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, P.E.K.K.A akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            11,
            R.drawable.baby_dragon,
            "Baby Dragon",
            30,
            "Bayi Naga adalah Troop ke-11 yang terbuka di Barracks standar. Ini adalah unit terbang yang menakutkan dan mampu menyerang unit darat dan udara dengan splash damage.\n" +
                    "Saat tidak ada unit udara teman dalam jarak 4,5 tile dari Bayi Naga, kemampuan Tantrumnya aktif, meningkatkan tingkat serangannya dan menggandakan kerusakannya.\n" +
                    "Bayi Naga tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Bayi Naga akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            12,
            R.drawable.miner,
            "Miner",
            25,
            "Miner adalah pasukan Elixir ke-12 yang terbuka di level 12 Barracks, yang membutuhkan Town Hall level 10.\n" +
                    "Miner adalah pasukan dengan target tunggal yang menggali di bawah tanah saat tidak terlibat dengan pasukan atau bangunan musuh. Ini memungkinkan dia memiliki kemampuan yang berguna untuk tidak terpengaruh oleh dinding dan mengebypass semua perangkap.\n" +
                    "Miner tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Miner akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            13,
            R.drawable.electro_dragon,
            "Electro Dragon",
            55,
            "Electro Dragon adalah Troop ke-13 yang terbuka di Barracks. Mereka adalah unit udara yang kuat dengan kesehatan yang biasa saja dan kerusakan tinggi.\n" +
                    "Electro Dragons tidak memiliki target yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeleton (baik dengan diserang sendiri atau dekat dengan pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Electro Dragons akan melanjutkan menyerang struktur terdekat.\n" +
                    "Electro Dragon menyerang dengan petir rantai, mampu mengenai hingga 4 target lain setelah serangan awal, dengan setiap serangan selanjutnya menimbulkan 20% kerusakan lebih sedikit dari serangan sebelumnya. Agar petir bisa rantai ke target lain, harus cukup dekat dengan target sebelumnya.\n" +
                    "Target dari petir rantai Electro Dragon ditentukan oleh jarak, dengan hitpoints sebagai tiebreaker; untuk menentukan target selanjutnya, target yang paling dekat dengan target sebelumnya dan yang belum terkena dip"
        ),
        Troops(
            14,
            R.drawable.yeti,
            "Yeti",
            40,
            "Yetimites adalah makhluk kecil yang dihasilkan oleh Yeti. Mereka menyerang dengan mendekati bangunan target sebelum melompat ke dalamnya setelah jeda singkat. Serangan lompatan ini menyebabkan sedikit kerusakan dan menghancurkan Yetimite saat terkena.\n" +
                    "Yetimites muncul saat Yeti mengalami kerusakan. Ketika Yeti dihancurkan, ia akan mengeluarkan semua Yetimites yang masih tersisa.\n" +
                    "Yetimites dapat melompat di atas Dinding dan menyebabkan kerusakan tambahan pada pertahanan.\n" +
                    "Yetimites memprioritaskan struktur pertahanan di atas semua target lain, dan akan mengabaikan semua jenis bangunan musuh dan pasukan lain saat ada pertahanan yang masih ada di medan perang. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan, atau Skeleton Trap skeleton. Perhatikan bahwa seperti semua pasukan yang memprioritaskan pertahanan, Yetimites tidak menganggap Clan Castle sebagai pertahanan apakah atau tidak berisi pasukan musuh, tetapi menganggap Grand Warden yang membela dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan dihancurkan, Yetimites menjadi seperti pasukan lain tanpa target yang dipilih; mereka akan menyerang bangunan terdekat dari mereka terlepas dari jenisnya, dan akan berbalik dan menyerang pasukan musuh jika menyadari adanya yang dekat dan dapat melawan mereka.\n" +
                    "Yetimites menyebabkan setengah kerusakan pada penyimpanan sumber daya jika menyerang mereka. Terutama ini berlaku untuk Town Hall level 12 dan di atas jika senjata Giga-nya akt"
        ),
        Troops(
            15,
            R.drawable.dragon_rider,
            "Dragon Rider",
            45,
            "Dragon Rider adalah pasukan mekanis yang ditumpangi oleh sebuah skelet yang memprioritaskan pertahanan. Pasukan ini bisa dibuka pada tingkat 15 Barracks, yang membutuhkan Town Hall level 13. Dragon Rider memprioritaskan struktur pertahanan di atas semua target lain, dan akan melewatkan semua jenis bangunan musuh dan pasukan lainnya sementara masih ada pertahanan di medan perang. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan, atau Skeleton Trap. Perhatikan bahwa seperti semua pasukan yang memprioritaskan pertahanan, Dragon Rider tidak menganggap Clan Castle sebagai pertahanan apakah atau tidak berisi pasukan musuh, tetapi menganggap Grand Warden yang membela dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan. Setelah semua pertahanan hancur, Dragon Rider menjadi seperti pasukan lainnya tanpa target yang dipilih; mereka akan menyerang bangunan terdekat ke mereka, tidak peduli jenisnya, dan akan menyerang pasukan musuh jika mengetahui adanya pasukan musuh di sekitarnya dan dapat membalas serangan tersebut."
        ),
        Troops(
            16,
            R.drawable.electro_titan,
            "Electro Titan",
            75,
            "Electro Titan adalah pasukan Elixir yang terbuka di Barracks level 16, yang membutuhkan Town Hall 14.\n" +
                    "Ia adalah pasukan darat dengan hitpoints yang sangat tinggi dan menyerang target tanah dan udara dengan serangan kekek pendek. Selain itu, aura di sekitarnya menyebabkan semua bangunan dan pasukan di dekatnya mengalami kerusakan terus-menerus per detik.\n" +
                    "Electro Titans tidak memiliki target yang diutamakan saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeletons (baik dengan diserang sendiri atau dengan berada di dekat pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya melibatkan pasukan musuh. Setelah semua pasukan musuh terdekat dikalahkan, Electro Titans akan melan"
        ),
        Troops(
            17,
            R.drawable.minion,
            "Minion",
            15,
            "Minion adalah troop Dark Elixir pertama yang terbuka di game, dan secara otomatis terbuka setelah Dark Barracks selesai dibangun. Minion merupakan unit udara yang cepat dan lemah dengan jarak pendek, yang menyemprotkan Dark Elixir untuk menyerang sasaran.\n" +
                    "Penampilan Minion adalah seperti gargoyle dengan tanduk besar, sayap pendek, dan tangan besar dengan cakar tajam yang penuh dengan apa yang tampak seperti Dark Elixir.\n" +
                    "Minion tidak terpengaruh oleh Seeking Air Mines.\n" +
                    "Minion tidak memiliki sasaran yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka mengetahui pasukan Clan Castle musuh, Heroes, atau Skeleton Trap (baik karena diserang sendiri atau dekat dengan pasukan teman yang diserang), dan dapat membalas serangan tersebut, mereka akan meninggalkan bangunan yang sebelumnya ditargetkan dan sebaliknya menyerang pasukan musuh. Setelah semua pasukan musuh di sekitar mereka dikalahkan, Minion akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            18,
            R.drawable.hog_rider,
            "Hog Rider",
            25,
            "Hog Rider adalah pasukan darat yang cepat dengan hit points sedang, damage rendah, dan kemampuan untuk melompat di atas tembok musuh. Ia diunlock di level 2 Dark Barracks. Hog Rider (manusia) adalah seorang pria dengan kulit gelap yang tidak memakai baju, memegang palu dan memiliki jambang mohawk. Ia mengenakan celana lusuh berwarna coklat, ikat pinggang merah, sepatu sandal kulit, dan dua gelang emas besar serta liontin emas di telinga. Pacuannya adalah seekor babi besar sekitar setengah tinggi dari dirinya yang memakai tali kekang kulit coklat yang dililit di taringnya dan dipegang oleh Hog Rider. Hog Riders prioritas adalah struktur pertahanan di atas target lain, dan akan mengabaikan semua jenis bangunan musuh dan pasukan sementara masih ada pertahanan di medan perang. Ini benar meskipun mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap. Perhatikan bahwa seperti semua pasukan yang memprioritaskan pertahanan, Hog Riders tidak menganggap Clan Castle sebagai pertahanan apakah atau tidak itu berisi pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan. Setelah semua pertahanan dihancurkan, Hog Riders menjadi seperti pasukan lain yang tidak memiliki target terpilih; mereka akan menyerang bangunan terdekat dari mereka tanpa memandang jenisnya, dan akan berbalik dan menyerang pasukan musuh jika mereka mengetahui adanya yang dekat dan dapat melawan mereka."
        ),
        Troops(
            19,
            R.drawable.valkyrie,
            "Valkyrie",
            20,
            "Valkyrie adalah pasukan yang terbuka setelah Dark Barracks diperbarui ke level 3 yang membutuhkan Town Hall level 8.\n" +
                    "Dia adalah prajurit yang tangguh dengan rambut oranye, yang terbungkus dalam loincloth kulit panjang dengan brassiere kulit yang cocok dan sepatu bot tinggi lutut. Dia memegang kapak ganda berukuran besar, yang sekitar setengah dari ukurannya.\n" +
                    "Valkyrie tidak memiliki sasaran yang dipilih saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Heroes, atau Skeleton Trap skeletons (baik dengan diserang atau dekat dengan pasukan teman yang diserang), dan dapat membalas, mereka akan meninggalkan bangunan yang sebelumnya ditargetkan dan sebaliknya melakukan serangan pada pasukan musuh. Setelah semua pasukan musuh di dekatnya dikalahkan, Valkyrie akan melanjutkan serangan pada struktur terdekat.\n" +
                    "Valkyrie mengelilingi kapak mereka sebagai metode serangan mereka, yang memungkinkan mereka untuk menyerang beberapa sasaran di sekitarnya sekaligus. Mereka akan berlari di antara bangunan untuk melakukan ini saat merupakan pilihan yang ideal. Namun, mereka tidak akan berlari melewati bangunan untuk memaksimalkan efek putaran."
        ),
        Troops(
            20,
            R.drawable.golem,
            "Golem",
            45,
            "Golem adalah Troop Elixir Gelap yang terbuka setelah Dark Barracks diupgrade ke level 4. Mereka adalah pasukan darat yang lambat dengan damage yang rendah, tetapi memiliki hitpoints yang besar.\n" +
                    "Saat seorang Golem dikalahkan, ia menghasilkan dua atau tiga Golemites (tergantung pada level Golem) yang terus bertarung, masing-masing membawa 1/5 dari statistik Golem. Golemites ini menyebabkan kerusakan daerah saat mereka dihancurkan.\n" +
                    "Golems menempatkan struktur pertahanan di atas target lainnya, dan akan mengabaikan semua jenis bangunan dan pasukan musuh lainnya sementara struktur pertahanan masih ada di medan perang. Ini benar bahkan jika mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeletons. Perhatikan bahwa seperti semua pasukan yang menempatkan pertahanan sebagai prioritas, Golems tidak menganggap Clan Castle sebagai pertahanan terlepas dari apakah atau tidak berisi pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan dihancurkan, Golems menjadi seperti pasukan lain tanpa target yang diutamakan; mereka akan menyerang bangunan terdekat ke mereka terlepas dari jenisnya, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di sekitarnya dan dapat melawan mereka."
        ),
        Troops(
            21,
            R.drawable.witch,
            "Witch",
            40,
            "Witch adalah pasukan Elixir Gelap yang merusak splash di Home Village yang terbuka setelah Dark Barracks diupgrade ke level 5, yang membutuhkan Town Hall level 9.\n" +
                    "Witch menembakkan proyektil biru ke targetnya dan dapat mengundang prajurit mati dari pertempuran masa lalu, yaitu Skeleton. Hanya sejumlah Skeleton per Witch yang dapat diundang ke medan perang pada saat yang sama (lihat tabel di bawah untuk rinciannya).\n" +
                    "Witch memiliki rambut ungu pendek yang sampai ke bahu dan memiliki mata merah muda. Dia memakai dua bagian bahu emas, ikat pinggang emas, dua gelang emas, dan rok yang rusak. Dia juga memakai mantel ungu yang rusak dan memegang tongkat dengan tengkorak kambing.\n" +
                    "Witch tidak memiliki target yang diutamakan saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeletons (baik dengan diserang sendiri atau dengan berada di dekat pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya melibatkan pasukan musuh. Setelah semua pasukan musuh terdekat dikalahkan, Witch akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            22,
            R.drawable.lava_hound,
            "Lava Hound",
            50,
            "Lava Hound adalah tank udara dengan hitpoint tinggi dengan damage yang rendah dan kecepatan moderat. Ini terbuka pada Dark Barracks level 6.\n" +
                    "Lava Hound adalah makhluk anjing api dengan sepasang sayap kecil. Ia dikemas dengan beberapa plat batu yang terkuat di tubuhnya dan lava mengalir melalui setiap sambungan.\n" +
                    "Saat dikalahkan, Lava Hound meledak, menyebabkan sedikit kerusakan di daerah tersebut sambil menghasilkan banyak Lava Pups, yang akan terus menyerang target di sekitarnya.\n" +
                    "Lava Hounds menempatkan Air Defenses di atas semua target lain, dan akan mengabaikan semua bangunan dan pasukan musuh lain sementara Air Defenses masih ada di medan perang. Ini benar bahkan jika mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeletons. Setelah semua Air Defenses dihancurkan, mereka akan terus menyerang pertahanan lain yang masih ada. Perhatikan bahwa seperti semua pasukan yang menempatkan pertahanan sebagai prioritas, Lava Hounds tidak menganggap Clan Castle sebagai pertahanan terlepas dari apakah atau tidak berisi pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan yang tersisa dihancurkan, Lava Hounds menjadi seperti pasukan lain tanpa target yang diutamakan; mereka akan menyerang bangunan terdekat ke mereka terlepas dari jenisnya, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di sekitarnya dan dapat melawan mereka."
        ),
        Troops(
            23,
            R.drawable.bowler,
            "Bowler",
            35,
            "Bowler adalah pasukan yang melemparkan batu besar yang melambung; menyebabkan kerusakan splash pada melambung awal dan menyebabkan kerusakan splash lagi saat mendarat. Bowler terbuka pada Dark Barracks level 7, yang terbuka pada Town Hall level 10.\n" +
                    "Bowler adalah pasukan darat pertama yang terbuka yang dapat merusak beberapa bangunan dalam garis lurus.\n" +
                    "Boulder Bowler hanya akan berjalan cukup jauh untuk mengenai dua target.\n" +
                    "Bowlers tidak memiliki target yang diutamakan saat menyerang; mereka hanya akan menyerang bangunan terdekat. Namun, jika mereka menyadari pasukan Clan Castle musuh, Pahlawan, atau Skeleton Trap skeletons (baik dengan diserang sendiri atau dengan berada di dekat pasukan teman lain yang diserang), dan dapat melawan mereka, mereka akan meninggalkan bangunan yang sebelumnya ditarget dan sebaliknya melibatkan pasukan musuh. Setelah semua pasukan musuh terdekat dikalahkan, Bowlers akan melanjutkan menyerang struktur terdekat."
        ),
        Troops(
            24,
            R.drawable.ice_golem,
            "Ice Golem",
            45,
            "Ice Golem adalah pasukan yang terbuka setelah Dark Barracks diupgrade ke level 8, yang membutuhkan Town Hall level 11.\n" +
                    "Ice Golems adalah pasukan tanking yang kuat dengan damage yang rendah tetapi hitpoints yang tinggi untuk ruang perumahan yang mereka tempati. Serangan mereka memperlambat apa yang mereka serang, mengurangi fire rate bangunan pertahanan atau unit yang terkena dampak sebesar 50% selama 2 detik. Saat mati, Ice Golem membekukan segala sesuatu dalam radius yang besar, benar-benar menguncangkan pertahanan dan unit musuh yang tertangkap di dalamnya. Namun, beku kematian tidak menyebabkan kerusakan apapun.\n" +
                    "Beku kematian Ice Golem tidak akan mencegah Traps dari terpicu atau menghentikan Trap yang terpicu dari meledak. (Trap tersebut akan terlihat seolah-olah sedang diserang oleh Ice Golem)\n" +
                    "Ice Golems menempatkan struktur pertahanan di atas semua target lainnya, dan akan mengabaikan semua jenis bangunan dan pasukan musuh lainnya sementara struktur pertahanan masih ada di medan perang. Ini benar bahkan jika mereka sedang diserang oleh pasukan Clan Castle musuh, pahlawan atau Skeleton Trap skeletons. Perhatikan bahwa seperti semua pasukan yang menempatkan pertahanan sebagai prioritas, Ice Golems tidak menganggap Clan Castle sebagai pertahanan terlepas dari apakah atau tidak berisi pasukan musuh, tetapi menganggap Grand Warden yang mempertahankan dan senjata Town Hall yang diaktifkan (jika ada) sebagai bangunan pertahanan.\n" +
                    "Setelah semua pertahanan dihancurkan, Ice Golems menjadi seperti pasukan lain tanpa target yang diutamakan; mereka akan menyerang bangunan terdekat ke mereka terlepas dari jenisnya, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di sekitarnya dan dapat melawan mereka."
        ),
        Troops(
            25,
            R.drawable.headhunter,
            "HeadHunter",
            20,
            "Headhunter adalah pasukan yang terbuka setelah Dark Barracks diupgrade ke level 9, yang membutuhkan pemain di Town Hall level 12.\n" +
                    "Headhunters menempatkan Pahlawan di atas semua target lainnya, dan akan mengabaikan semua jenis bangunan dan pasukan musuh lainnya sementara Pahlawan musuh masih ada di medan perang. Ini benar bahkan jika mereka sedang diserang oleh pasukan Clan Castle musuh atau Skeleton Trap skeletons. Perhatikan bahwa Grand Warden yang mempertahankan dianggap sebagai pertahanan dan bukan Pahlawan.\n" +
                    "Setelah semua Pahlawan musuh dikalahkan, Headhunters menjadi seperti pasukan lain tanpa target yang diutamakan; mereka akan menyerang bangunan terdekat ke mereka terlepas dari jenisnya, dan akan berbalik dan menyerang unit musuh jika menyadari adanya unit musuh di sekitarnya dan dapat melawan mereka.\n" +
                    "Serangan Headhunters memiliki efek Spell Poison, yang sementara memperlambat pasukan dan pahlawan yang diserang. Racun tidak mempengaruhi bangunan dan tidak menyebabkan kerusakan sendiri.\n" +
                    "Kemampuan Headhunters tidak berlaku pada Grand Warden yang mempertahankan karena dianggap sebagai bangunan.\n" +
                    "Headhunters dapat melewati Walls untuk mencapai target apapun di belakang mereka.\n" +
                    "Headhunter memiliki kecepatan gerak yang sama dengan Goblins, Sneaky Goblins, Minions, dan Miners."
        ),
    )
}