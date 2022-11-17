package br.gov.pr.toledo.api.interfaces.rest.organ

import org.springframework.http.ResponseEntity

interface OrganResource {
    fun list(): ResponseEntity<List<OrganSummaryDTO>>

    fun findById(id: Int): ResponseEntity<OrganDTO>

}