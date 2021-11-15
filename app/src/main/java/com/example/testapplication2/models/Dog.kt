package com.example.testapplication2.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Dog(
    val affenpinscher: List<String>?,
    val african: List<String>?,
    val airedale: List<String>?,
    val akita: List<String>?,
    val appenzeller: List<String>?,
    val australian: List<String>?,
    val basenji: List<String>?,
    val beagle: List<String>?,
    val bluetick: List<String>?,
    val borzoi: List<String>?,
    val bouvier: List<String>?,
    val boxer: List<String>?,
    val brabancon: List<String>?,
    val briard: List<String>?,
    val buhund: List<String>?,
    val bulldog: List<String>?,
    val bullterrier: List<String>?,
    val cattledog: List<String>?,
    val chihuahua: List<String>?,
    val chow: List<String>?,
    val clumber: List<String>?,
    val cockapoo: List<String>?,
    val collie: List<String>?,
    val coonhound: List<String>?,
    val corgi: List<String>?,
    val cotondetulear: List<String>?,
    val dachshund: List<String>?,
    val dalmatian: List<String>?,
    val dane: List<String>?,
    val deerhound: List<String>?,
    val dhole: List<String>?,
    val dingo: List<String>?,
    val doberman: List<String>?,
    val elkhound: List<String>?,
    val entlebucher: List<String>?,
    val eskimo: List<String>?,
    val finnish: List<String>?,
    val frise: List<String>?,
    val germanshepherd: List<String>?,
    val greyhound: List<String>?,
    val groenendael: List<String>?,
    val havanese: List<String>?,
    val hound: List<String>?,
    val husky: List<String>?,
    val keeshond: List<String>?,
    val kelpie: List<String>?,
    val komondor: List<String>?,
    val kuvasz: List<String>?,
    val labradoodle: List<String>?,
    val labrador: List<String>?,
    val leonberg: List<String>?,
    val lhasa: List<String>?,
    val malamute: List<String>?,
    val malinois: List<String>?,
    val maltese: List<String>?,
    val mastiff: List<String>?,
    val mexicanhairless: List<String>?,
    val mix: List<String>?,
    val mountain: List<String>?,
    val newfoundland: List<String>?,
    val otterhound: List<String>?,
    val ovcharka: List<String>?,
    val papillon: List<String>?,
    val pekinese: List<String>?,
    val pembroke: List<String>?,
    val pinscher: List<String>?,
    val pitbull: List<String>?,
    val pointer: List<String>?,
    val pomeranian: List<String>?,
    val poodle: List<String>?,
    val pug: List<String>?,
    val puggle: List<String>?,
    val pyrenees: List<String>?,
    val redbone: List<String>?,
    val retriever: List<String>?,
    val ridgeback: List<String>?,
    val rottweiler: List<String>?,
    val saluki: List<String>?,
    val samoyed: List<String>?,
    val schipperke: List<String>?,
    val schnauzer: List<String>?,
    val setter: List<String>?,
    val sheepdog: List<String>?,
    val shiba: List<String>?,
    val shihtzu: List<String>?,
    val spaniel: List<String>?,
    val springer: List<String>?,
    val stbernard: List<String>?,
    val terrier: List<String>?,
    val tervuren: List<String>?,
    val vizsla: List<String>?,
    val waterdog: List<String>?,
    val weimaraner: List<String>?,
    val whippet: List<String>?,
    val wolfhound: List<String>?,
) {
    fun getDogsWithBreeds(): List<DogWithBreeds> {
        val dogsList = mutableListOf<DogWithBreeds>()
        this.affenpinscher?.let { dogsList.add(DogWithBreeds("affenpinscher", it)) }
        this.african?.let { dogsList.add(DogWithBreeds("african", it)) }
        this.airedale?.let { dogsList.add(DogWithBreeds("airedale", it)) }
        this.akita?.let { dogsList.add(DogWithBreeds("akita", it)) }
        this.appenzeller?.let { dogsList.add(DogWithBreeds("appenzeller", it)) }
        this.australian?.let { dogsList.add(DogWithBreeds("australian", it)) }
        this.basenji?.let { dogsList.add(DogWithBreeds("basenji", it)) }
        this.beagle?.let { dogsList.add(DogWithBreeds("beagle", it)) }
        this.bluetick?.let { dogsList.add(DogWithBreeds("bluetick", it)) }
        this.borzoi?.let { dogsList.add(DogWithBreeds("borzoi", it)) }
        this.bouvier?.let { dogsList.add(DogWithBreeds("bouvier", it)) }
        this.boxer?.let { dogsList.add(DogWithBreeds("boxer", it)) }
        this.brabancon?.let { dogsList.add(DogWithBreeds("brabancon", it)) }
        this.briard?.let { dogsList.add(DogWithBreeds("briard", it)) }
        this.buhund?.let { dogsList.add(DogWithBreeds("buhund", it)) }
        this.bulldog?.let { dogsList.add(DogWithBreeds("bulldog", it)) }
        this.bullterrier?.let { dogsList.add(DogWithBreeds("bullterrier", it)) }
        this.cattledog?.let { dogsList.add(DogWithBreeds("cattledog", it)) }
        this.chihuahua?.let { dogsList.add(DogWithBreeds("chihuahua", it)) }
        this.chow?.let { dogsList.add(DogWithBreeds("chow", it)) }
        this.clumber?.let { dogsList.add(DogWithBreeds("clumber", it)) }
        this.cockapoo?.let { dogsList.add(DogWithBreeds("cockapoo", it)) }
        this.collie?.let { dogsList.add(DogWithBreeds("collie", it)) }
        this.coonhound?.let { dogsList.add(DogWithBreeds("coonhound", it)) }
        this.corgi?.let { dogsList.add(DogWithBreeds("corgi", it)) }
        this.cotondetulear?.let { dogsList.add(DogWithBreeds("cotondetulear", it)) }
        this.dachshund?.let { dogsList.add(DogWithBreeds("dachshund", it)) }
        this.dalmatian?.let { dogsList.add(DogWithBreeds("dalmatian", it)) }
        this.dane?.let { dogsList.add(DogWithBreeds("dane", it)) }
        this.deerhound?.let { dogsList.add(DogWithBreeds("deerhound", it)) }
        this.dhole?.let { dogsList.add(DogWithBreeds("dhole", it)) }
        this.dingo?.let { dogsList.add(DogWithBreeds("dingo", it)) }
        this.doberman?.let { dogsList.add(DogWithBreeds("doberman", it)) }
        this.elkhound?.let { dogsList.add(DogWithBreeds("elkhound", it)) }
        this.entlebucher?.let { dogsList.add(DogWithBreeds("entlebucher", it)) }
        this.eskimo?.let { dogsList.add(DogWithBreeds("eskimo", it)) }
        this.finnish?.let { dogsList.add(DogWithBreeds("finnish", it)) }
        this.frise?.let { dogsList.add(DogWithBreeds("frise", it)) }
        this.germanshepherd?.let { dogsList.add(DogWithBreeds("germanshepherd", it)) }
        this.greyhound?.let { dogsList.add(DogWithBreeds("greyhound", it)) }
        this.groenendael?.let { dogsList.add(DogWithBreeds("groenendael", it)) }
        this.havanese?.let { dogsList.add(DogWithBreeds("havanese", it)) }
        this.hound?.let { dogsList.add(DogWithBreeds("hound", it)) }
        this.husky?.let { dogsList.add(DogWithBreeds("husky", it)) }
        this.keeshond?.let { dogsList.add(DogWithBreeds("keeshond", it)) }
        this.kelpie?.let { dogsList.add(DogWithBreeds("kelpie", it)) }
        this.komondor?.let { dogsList.add(DogWithBreeds("komondor", it)) }
        this.kuvasz?.let { dogsList.add(DogWithBreeds("kuvasz", it)) }
        this.labradoodle?.let { dogsList.add(DogWithBreeds("labradoodle", it)) }
        this.labrador?.let { dogsList.add(DogWithBreeds("labrador", it)) }
        this.leonberg?.let { dogsList.add(DogWithBreeds("leonberg", it)) }
        this.lhasa?.let { dogsList.add(DogWithBreeds("lhasa", it)) }
        this.malamute?.let { dogsList.add(DogWithBreeds("malamute", it)) }
        this.malinois?.let { dogsList.add(DogWithBreeds("malinois", it)) }
        this.maltese?.let { dogsList.add(DogWithBreeds("maltese", it)) }
        this.mastiff?.let { dogsList.add(DogWithBreeds("mastiff", it)) }
        this.mexicanhairless?.let { dogsList.add(DogWithBreeds("mexicanhairless", it)) }
        this.mix?.let { dogsList.add(DogWithBreeds("mix", it)) }
        this.mountain?.let { dogsList.add(DogWithBreeds("mountain", it)) }
        this.newfoundland?.let { dogsList.add(DogWithBreeds("newfoundland", it)) }
        this.otterhound?.let { dogsList.add(DogWithBreeds("otterhound", it)) }
        this.ovcharka?.let { dogsList.add(DogWithBreeds("ovcharka", it)) }
        this.papillon?.let { dogsList.add(DogWithBreeds("papillon", it)) }
        this.pekinese?.let { dogsList.add(DogWithBreeds("pekinese", it)) }
        this.pembroke?.let { dogsList.add(DogWithBreeds("pembroke", it)) }
        this.pinscher?.let { dogsList.add(DogWithBreeds("pinscher", it)) }
        this.pitbull?.let { dogsList.add(DogWithBreeds("pitbull", it)) }
        this.pointer?.let { dogsList.add(DogWithBreeds("pointer", it)) }
        this.pomeranian?.let { dogsList.add(DogWithBreeds("pomeranian", it)) }
        this.poodle?.let { dogsList.add(DogWithBreeds("poodle", it)) }
        this.pug?.let { dogsList.add(DogWithBreeds("pug", it)) }
        this.puggle?.let { dogsList.add(DogWithBreeds("puggle", it)) }
        this.pyrenees?.let { dogsList.add(DogWithBreeds("pyrenees", it)) }
        this.redbone?.let { dogsList.add(DogWithBreeds("redbone", it)) }
        this.retriever?.let { dogsList.add(DogWithBreeds("retriever", it)) }
        this.ridgeback?.let { dogsList.add(DogWithBreeds("ridgeback", it)) }
        this.rottweiler?.let { dogsList.add(DogWithBreeds("rottweiler", it)) }
        this.saluki?.let { dogsList.add(DogWithBreeds("saluki", it)) }
        this.samoyed?.let { dogsList.add(DogWithBreeds("samoyed", it)) }
        this.schipperke?.let { dogsList.add(DogWithBreeds("schipperke", it)) }
        this.schnauzer?.let { dogsList.add(DogWithBreeds("schnauzer", it)) }
        this.setter?.let { dogsList.add(DogWithBreeds("setter", it)) }
        this.sheepdog?.let { dogsList.add(DogWithBreeds("sheepdog", it)) }
        this.shiba?.let { dogsList.add(DogWithBreeds("shiba", it)) }
        this.shihtzu?.let { dogsList.add(DogWithBreeds("shihtzu", it)) }
        this.spaniel?.let { dogsList.add(DogWithBreeds("spaniel", it)) }
        this.springer?.let { dogsList.add(DogWithBreeds("springer", it)) }
        this.stbernard?.let { dogsList.add(DogWithBreeds("stbernard", it)) }
        this.terrier?.let { dogsList.add(DogWithBreeds("terrier", it)) }
        this.tervuren?.let { dogsList.add(DogWithBreeds("tervuren", it)) }
        this.vizsla?.let { dogsList.add(DogWithBreeds("vizsla", it)) }
        this.waterdog?.let { dogsList.add(DogWithBreeds("waterdog", it)) }
        this.weimaraner?.let { dogsList.add(DogWithBreeds("weimaraner", it)) }
        this.whippet?.let { dogsList.add(DogWithBreeds("whippet", it)) }
        this.wolfhound?.let { dogsList.add(DogWithBreeds("wolfhound", it)) }
        return dogsList
    }
}
