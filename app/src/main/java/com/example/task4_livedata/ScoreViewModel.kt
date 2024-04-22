package com.example.task4_livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {
    private var _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = 0
    }

    fun incrementScore() {
        val currentScore = _score.value ?: 0
        if (currentScore < 100) {
            _score.value = currentScore + 1
        }
    }

    fun decrementScore() {
        val currentScore = _score.value ?: 0
        if (currentScore > 0) {
            _score.value = currentScore - 1
        }
    }
}