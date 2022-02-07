package com.osisupermoses.dictionaryapp.feature_dictionary.domain.repository

import com.osisupermoses.dictionaryapp.core.util.Resource
import com.osisupermoses.dictionaryapp.feature_dictionary.domain.model.WordInfo

interface WordInfoRepository {

    fun getWordInfo(word: String): kotlinx.coroutines.flow.Flow<Resource<List<WordInfo>>>
}