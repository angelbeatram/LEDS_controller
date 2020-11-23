import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.smartleds.Blancos
import com.example.smartleds.Colores

@Suppress("DEPRECATION")
internal class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :


    FragmentPagerAdapter(fm) {
    override fun  getItem(position: Int):Fragment {
        return when (position) {
            0 -> {
                Blancos()
            }
            1 -> {
                Colores()
            }

            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}