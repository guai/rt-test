package com.example.rttestconsumer

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
class Status {
    var status: String? = null

    override fun toString(): String {
        return "Status(status=$status)"
    }
}