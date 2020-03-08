package loader

import controller.JsonRequest
import loader.impl.CsvDataLoader
import loader.request.CsvRequest
import loader.response.Response

class DataLoaderStorategy(
        val csvDataLoader: CsvDataLoader
) {
    fun getDataLoader(type: String): (JsonRequest) -> Response {
        return when (type) {
            "aaa"-> {
                jsonRequest: JsonRequest -> csvDataLoader.load(CsvRequest(jsonRequest))
            }
            else -> throw NotImplementedError("実装していないtype")
        }
    }
}