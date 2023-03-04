package id.arjuna.tanamanobat

object PlantsData {
    private val plantNames = arrayOf(
        "Kumis Kucing",
        "Lidah Buaya",
        "Belimbing Wuluh",
        "Temulawak",
        "Daun Cincau",
        "Jahe",
        "Buah Srikaya",
        "Lengkuas",
        "Mengkudu",
        "Kencur"
    )

    private val plantDetails = arrayOf(
        "Orthosiphon aristatus atau dikenal dengan nama kumis kucing termasuk tanaman dari famili Lamiaceae/Labiatae. Tanaman ini merupakan salah satu tanaman obat asli Indonesia yang mempunyai manfaat dan kegunaan yang cukup banyak dalam menanggulangi berbagai penyakit.\n\nDaun kumis kucing sangat terkenal ampuh untuk mengobati kencing batu dan melancarkan saluran kemih karena memiliki sifat diuretik yang dapat membantu meningkatkan produksi urin.  Dengan demikian, bakteri kotor pada kandung kemih dapat terbuang.\n\nSelain itu, kumis kucing juga mengandung zat anti radang yang sangat berkhasiat untuk mengobati rematik, asam urat, alergi, batuk, gangguan pada ginjal, diabetes, hingga hipertensi. Tak hanya bermanfaat untuk kesehatan, bentuk tanaman kumis kucing yang cantik juga bisa memperindah halaman rumah.",
        "Lidah buaya adalah spesies tumbuhan dengan daun berdaging tebal dari genus Aloe. Tumbuhan ini bersifat menahun, berasal dari Jazirah Arab, dan tanaman liarnya telah menyebar ke kawasan beriklim tropis, semi-tropis, dan kering di berbagai belahan dunia.\n\nTanaman obat ini sangat populer dan disukai oleh banyak orang, terutama oleh para wanita. Lidah buaya terkenal bermanfaat untuk kecantikan wajah, rambut, dan kulit, seperti melembapkan kulit, menghilangkan jerawat dan bekasnya, menutrisi dan menghitamkan rambut, hingga mengurangi bekas luka bakar.\n\nDaging tanaman obat lidah buaya juga bermanfaat untuk kesehatan tubuh, seperti meredakan batuk, menurunkan kadar gula darah, mengatasi masalah pencernaan, mengobati radang tenggorokan, sembelit, dan diabetes. Pada saat cuaca panas terik, daging tanaman ini pun bisa dimasak menggunakan air gula, lalu tambahkan es batu sebagai minuman penyegar tenggorokan.",
        "Belimbing sayur merupakan sejenis pohon kecil yang diperkirakan berasal dari Kepulauan Maluku, dan dikembangbiakkan serta tumbuh bebas di Indonesia, Filipina, Sri Lanka, Myanmar, dan Malaysia.\n\nBelimbing wuluh biasanya digunakan untuk menambahkan rasa asam pada sejumlah masakan tradisional Indonesia. Selain untuk memasak di dapur, ternyata belimbing wuluh yang berukuran kecil ini juga tergolong sebagai tanaman obat yang manjur untuk mengobati berbagai macam penyakit, lho!\n\nSebagai tanaman obat, belimbing wuluh sangat berkhasiat untuk mengobati gusi berdarah, rematik, gondongan, sariawan, pegal linu, hingga sakit gigi. Tak hanya buahnya saja, bagian batang dan daun dari belimbing wuluh ini juga bisa dimanfaatkan untuk kesehatan, lho!",
        "Temu lawak, nama ilmiah: Curcuma zanthorrhiza, adalah tumbuhan obat yang tergolong dalam suku temu-temuan. Ia berasal dari Indonesia, khususnya Pulau Jawa, kemudian menyebar ke beberapa tempat di kawasan wilayah biogeografi Malesia.\n\nTanaman obat terkenal berikutnya adalah temulawak yang berasal dari Indonesia. Sudah dari dulu temulawak dikenal sebagai bahan untuk minuman jamu. Bagian temulawak yang paling sering digunakan adalah akar dan dagingnya yang berbentuk lonjong dan berukuran sedang.\n\nTanaman obat yang bisa kamu coba tanam di dekat teras rumah ini sangat berkhasiat untuk mengobati gangguan ginjal, antiradang, mengatasi sendi yang sakit dan kaku, mengatasi sistem pencernaan yang terganggu, menjaga kesehatan hati, menguatkan jantung, hingga mencegah dan mengobati kanker.",
        "Daun cincau, nama ilmiah: Cocculus orbiculatus, adalah spesies tanaman merambat berkayu. Itu ditemukan dari India timur ke Jawa.\n\nTahukah kamu bahwa minuman cincau yang sering kamu beli di penjual kaki lima dibuat dari daun cincau? Tanaman obat yang satu ini dikenal sangat ampuh untuk meredakan panas dalam, mengobati demam, mengatasi tekanan darah yang tinggi, mengobati diare, meredakan radang lambung, mengurangi nyeri otot, hingga meningkatkan imunitas dan daya tahan tubuh.\n\nSelain lidah buaya, daun cincau adalah tanaman obat lainnya yang memiliki rasa enak dan banyak dijual. Bagi kamu yang ingin menanamnya di rumah, daun cincau ini bisa diletakkan di dekat gazebo sebagai dekor yang bermanfaat sekaligus menyejukkan bagi tiang-tiang karena sifatnya merambat.",
        "Jahe, adalah tumbuhan yang rimpangnya sering digunakan sebagai rempah-rempah dan bahan baku pengobatan tradisional. Rimpangnya berbentuk jemari yang menggembung di ruas-ruas tengah. Rasa dominan pedas yang dirasakan dari jahe disebabkan oleh senyawa keton bernama zingeron. Jahe termasuk dalam famili Zingiberaceae.\n\nTanaman obat jahe pasti sudah tidak asing lagi di telingamu karena sangat populer sebagai obat tradisional. Jahe berkhasiat untuk menghangatkan tubuh di saat cuaca dingin, mengatasi masuk angin, mual dan gangguan pencernaan, hingga menyembuhkan batuk karena rasanya yang sedikit pedas dan panas.\n\nBagi para perempuan, tanaman obat jahe juga ampuh untuk meredakan nyeri saat datang bulan. Tak hanya itu, jahe juga dipercaya dapat mencegah pertumbuhan sel kanker pada usus besar. Beberapa hidangan khas Indonesia pun banyak yang menggunakan ramuan jahe.",
        "Srikaya, adalah tanaman yang tergolong ke dalam genus Annona yang berasal dari daerah tropis. Buah srikaya berbentuk bulat dengan kulit bermata banyak. Daging buahnya berwarna putih. Termasuk semak semi-hijau abadi atau pohon yang meranggas mencapai 8 m tingginya.\n\nTak hanya nikmat dimakan buahnya, tanaman obat buah srikaya ternyata memiliki banyak khasiat untuk mengobati berbagai penyakit, lho! Bagian daun, akar, dan kulitnya mengandung berbagai zat yang bersifat antiradang dan antidepresi sehingga sangat baik untuk kesehatan.\n\nBuah srikaya berkhasiat membunuh cacing pada usus, mempercepat proses penghilangan bisul, melancarkan pencernaan, menguatkan tulang, menurunkan tekanan darah tinggi, dan mengurangi nyeri. Selain itu, bagi ibu hamil, tanaman obat ini juga bermanfaat untuk perkembangan janin dalam kandungan dan mengurangi rasa mual.",
        "Lengkuas, laos atau kelawas merupakan jenis tumbuhan umbi-umbian yang bisa hidup di daerah dataran tinggi maupun dataran rendah. Lengkuas adalah salah satu jenis rempah-rempah yang banyak ditanam di Asia, seperti India, Arab, Cina, Sri Lanka, dan Indonesia.\n\nTanaman obat ini memiliki banyak kandungan berkhasiat, seperti zat besi, vitamin C, vitamin A, beta-sitosterol, galangin, flavonoid, karbohidrat, dan serat. Nah, karena kandungannya ada banyak, maka manfaat lengkuas sendiri pun sangat kaya.\n\nLengkuas berkhasiat untuk mengurangi rasa nyeri dan peradangan, melawan infeksi, serta meningkatkan kesuburan pria. Selain itu, tanaman obat ini juga bermanfaat sebagai antioksidan dan antikanker, lho!",
        "Mengkudu atau keumeudee; pace, kemudu, kudu; cangkudu; koddhu', pacè; tibah berasal daerah Asia Tenggara, tergolong dalam famili Rubiaceae. Nama lain untuk tanaman ini adalah noni, nono, nonu, ungcoikan dan ach. Tanaman ini tumbuh di dataran rendah hingga pada ketinggian 1500 m.\n\nTak disangka, ternyata buah mengkudu juga termasuk tanaman obat yang punya banyak manfaat, lho! Meskipun rasanya pahit, tapi buah yang kulitnya berwarna hijau ini sudah terkenal akan khasiatnya untuk mengatasi berbagai penyakit karena mengandung biotin, folat, dan vitamin C.\n\nAdapun, buah mengkudu ini bisa kamu manfaatkan untuk mengatasi infeksi, radang sendi, nyeri, bahkan sembelit. Kalau ada tanaman obat ini di halaman rumahmu, jangan sia-siakan manfaatnya, ya!",
        "Kencur atau cekur (Kaempferia galanga) adalah tanaman yang mempunyai akar batang yang tertanam di dalam tanah, biasa dipakai untuk bahan rempah-rempah dan ramuan obat. Tanaman ini termasuk dalam kingdom Plantae,  sub kingdom: Phanerogamae, divisi: Spermatophyta, sub divisi: Angiospermae, kelas: Monocotyledonae, seri: Epigynae, ordo: Scitaminales, keluarga: Zingiberaceae, genus: Kaempferiam, spesies: galanga. Bagian tanaman kencur yang sering digunakan adalah rimpang, akar dan daun.\n\nKencur merupakan tanaman obat yang masih satu keluarga dengan jahe. Maka itu, tidak heran kalau tampilannya sangat mirip. Untuk khasiatnya sendiri, kencur bermanfaat untuk meredakan penyakit flu, batuk, sakit kepala, diare, dan juga radang lambung.\n\nTak hanya itu saja, tanaman obat ini juga mampu memperlancar haid bagi wanita, menambah nafsu makan, hingga menambah stamina tubuh. Kalau kamu tidak mau mengonsumsi langsung, kamu bisa menjadikan kencur sebagai jamu yang berkhasiat."
    )

    private val plantsImages = intArrayOf(
        R.drawable.kumis_kucing,
        R.drawable.lidah_buaya,
        R.drawable.belimbing_wuluh,
        R.drawable.temulawak,
        R.drawable.daun_cincau,
        R.drawable.jahe,
        R.drawable.buah_srikaya,
        R.drawable.lengkuas,
        R.drawable.mengkudu,
        R.drawable.kencur
        )

    val listData: ArrayList<Plant>
        get() {
            val list = arrayListOf<Plant>()
            for (position in plantNames.indices){
                val plant = Plant()
                plant.name = plantNames[position]
                plant.detail = plantDetails[position]
                plant.photo = plantsImages[position]
                list.add(plant)
            }
            return list
        }
}