package isomora.com.greendoctor

class Traductor {


    fun Traduce(text: String?): String {
        return when (text) {
            "apple apple scab" -> "ostra de manzana"
            "apple black rot" -> "podredumbre negra de manzana"
            "apple cedar apple rust" -> "manzana con óxido"
            "apple healthy" -> "manzana saludable"
            "blueberry healthy" -> "arándano saludable"
            "cherry including sour powdery mildew" -> "cereza incluyendo moho agrio"
            "cherry including sour healthy" -> "cereza incluyendo agrio saludable"
            "corn maize cercospora leaf spot gray leaf spot " -> "maíz  cercospora con mancha en la hoja "
            "corn maize common rust " -> "maíz con óxido común"
            "corn maize northern leaf blight" -> "maíz  con plaga del norte"
            "corn maize healthy" -> "maíz saludable"
            "grape black rot" -> "podredumbre negra de la uva"
            "grape esca black measles" -> "uva esca con sarampión negro"
            "grape leaf blight isariopsis leaf spot" -> "uva isariopsis con mancha en la hoja"
            "grape healthy" -> "uva saludable"
            "orange haunglongbing citrus greening" -> "naranja verdeada"
            "peach bacterial spot" -> "mancha bacteriana de durazno"
            "peach healthy" -> "durazno saludable"
            "pepper bell bacterial spot" -> "mancha bacteriana de pimiento"
            "pepper bell healthy" -> "pimiento saludable"
            "potato early blight" -> "tizón temprano de la papa"
            "potato late blight" -> "tizón tardío de la papa"
            "potato healthy" -> "papa saludable"
            "raspberry healthy" -> "frambuesa saludable"
            "soybean healthy" -> "soja saludable"
            "squash powdery mildew" -> "moho pulverulento"
            "strawberry leaf scorch" -> "chamuscado de hoja de fresa"
            "strawberry healthy" -> "fresa saludable"
            "tomato bacterial spot" -> "mancha bacteriana del tomate"
            "tomato early blight" -> "tizón temprano del tomate"
            "tomato late blight" -> "tizón tardío del tomate"
            "tomato leaf mold" -> "moho de hoja de tomate"
            "tomato septoria leaf spot" -> "mancha de hoja de tomate septoria"
            "tomato spider mites two spotted spider mite" -> "ácaros del tomate"
            "tomato target spot" -> "punto objetivo de tomate"
            "tomato tomato yellow leaf curl virus" -> "tomate virus de enrollamiento de hoja amarilla"
            "tomato tomato mosaic virus" -> "virus del mosaico del tomate"
            "tomato healthy" -> "tomate saludable"
            else -> "sin traduccion"
        }
    }
}