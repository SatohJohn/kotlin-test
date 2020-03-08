package controller

import loader.DataLoaderStorategy
import loader.response.Response

class Controller(
        val loaderStorategy: DataLoaderStorategy
) {

    fun load(jsonRequest: JsonRequest): Response {
        val loader = loaderStorategy.getDataLoader(jsonRequest.type)
        return loader.invoke(jsonRequest)
    }

}