package com.spiderwalk.hotsauces.domain

import javax.persistence.*

/**
 *
 *
 * @author Jev Prentice
 * @since 07 December 2021
 */
@Entity
data class HotSauce(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    // These properties are NOT likely to be longer than 256 characters.
    var brandName: String = "",
    var sauceName: String = "",

    // These properties might be longer than 256 characters.
    @Lob
    var description: String = "",
    @Lob
    var url: String = "",

    var heat: Int = 0
);