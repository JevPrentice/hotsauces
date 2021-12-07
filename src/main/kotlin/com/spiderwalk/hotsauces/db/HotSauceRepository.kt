package com.spiderwalk.hotsauces.db

import com.spiderwalk.hotsauces.domain.HotSauce
import org.springframework.data.repository.CrudRepository

/**
 *
 *
 * @author Jev Prentice
 * @since 07 December 2021
 */
interface HotSauceRepository : CrudRepository<HotSauce, Long> {
}