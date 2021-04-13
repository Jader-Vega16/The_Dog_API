package ni.uca.the_dog_api.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ni.uca.the_dog_api.R
import ni.uca.the_dog_api.intent.Intent
import ni.uca.the_dog_api.ui.MainViewModel
import ni.uca.the_dog_api.utils.AdapterDogs
import ni.uca.the_dog_api.utils.DataState
import javax.inject.Inject


@ExperimentalCoroutinesApi
@AndroidEntryPoint

class MainFragment constructor(
) : Fragment(R.layout.fragment_first) {

}