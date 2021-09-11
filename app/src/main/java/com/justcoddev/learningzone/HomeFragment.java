package com.justcoddev.learningzone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.justcoddev.learningzone.Adaptadores.AreasAdapter;
import com.justcoddev.learningzone.Adaptadores.AreasAdapter2;
import com.justcoddev.learningzone.Entidades.Areas;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    AreasAdapter areasAdapter;
    RecyclerView recyclerViewAreas;
    ArrayList<Areas> listAreas;
    //List<Areas> modelList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewAreas = view.findViewById(R.id.recyclerView);

        listAreas = new ArrayList<>();
        //modelList= new ArrayList<>();
        //update list
        updatelist();

        //mostrarlist

        //geData();
        Dataview();

        return view;
    }
   /* public void Dataview() {
        recyclerViewAreas.setLayoutManager(new LinearLayoutManager(getContext()));
        AreasAdapter2 Adapter= new AreasAdapter2(modelList);
        recyclerViewAreas.setAdapter(Adapter);
    }
*/

   /* private void geData() {
        modelList.add(new Areas("Desarrollo de software","Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software2","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software3","ddd",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software4","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software5","ddd",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software6","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software7","LREN ASSCAS SAVGFJK JFFFKFKFO VKGKG KDDVK  kdkfgk",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software8","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software9","ddd",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software10","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software11","ddd",R.drawable.ut01));
        modelList.add(new Areas("Desarrollo de software12","ddd",R.drawable.ut02));
        modelList.add(new Areas("Desarrollo de software13","ddd",R.drawable.ut01));
    }*/

    public void Dataview() {
        recyclerViewAreas.setLayoutManager(new LinearLayoutManager(getContext()));
        areasAdapter = new AreasAdapter(getContext(), listAreas);
        recyclerViewAreas.setAdapter(areasAdapter);
    }

    public void updatelist() {
        listAreas.add(new Areas("1. Desarrollo de Web", "La web es todo lo que se puede ejecutar en un navegador. ¿Y qué es un navegador? Son programas como Chrome, Opera, Microsoft Edge que nos permiten acceder a sitios como Twitter, Facebook, YouTube, Slack, etc.", R.drawable.ut01));
        listAreas.add(new Areas("2. Desarrollo Movil", "El desarrollo móvil es simples palabras es crear aplicaciones para teléfonos y estas pueden funcionar en 2 sistemas operativos: Android de Google y iOS de Apple.\n" +
                "\n" +
                "En Android puedes desarrollar con lenguajes como Kotlin o Java, mientras que en IOS está Swift.", R.drawable.ut01));
        listAreas.add(new Areas("3. Desarrollo de Videojuegos", "Ya todos los conocemos, tienen sus propias consolas, están en móviles, en ordenadores y consolas. Su mundo es enorme, hay diseñadores, storytelling, modelado de personajes. Entre los motores más importantes que puedes usar para desarrollar videojuegos se encuentran, Unity 3D que utiliza C# y Unreal Engine que usa C++.", R.drawable.ut02));
        listAreas.add(new Areas("4. Realidad Virtual y Aumentada", "La realidad virtual es una inmersión total, se suele utilizar un casco o lentes que ocupa toda tu visión, y con ello puedes transportarte a un mundo de ensueño, hay proyectos muy conocidos como Beat Saber y Half-Life: Alyx.\n" +
                "\n" +
                "Mientras que la realidad aumentada combina nuestra realidad con la virtual, un ejemplo de ello es Pokémon GO o los filtros de Snapchat. ", R.drawable.ut01));

        listAreas.add(new Areas("5. Desarrollo de Aplicaciones de Escritorio", "Son aplicaciones que se instalan directamente en tu sistema operativo de computadora sea Windows,Linux, Mac OS, por ejemplo: Adobe Premier, Office, un editor de código, un IDE. Para desarrollar este tipo de aplicaciones se pueden utilizar lenguajes como Java, C#, Python", R.drawable.ut01));
        listAreas.add(new Areas("6. Sistemas Operativos / Embebidos", "Los sistemas operativos son justamente Windows, Linux, Android o IOS, es la capa más baja de software que se comunica directamente con el hardware. Se suelen usar lenguajes como Ensamblador o C para desarrollarlos.", R.drawable.ut01));
        listAreas.add(new Areas("7. Seguridad Informática", "La seguridad informática es tarea de todos, tanto de los programadores como de los administradores de sistemas, y aunque no lo parezca el usuario como tal es el eslabón más débil. Por su parte la seguridad informática se puede clasificar en 2 áreas:\n" +
                "\n" +
                "Ofensiva\n"+"\n" +"Defensiva", R.drawable.ut01));
        listAreas.add(new Areas("8. Machine learning", "Básicamente consiste en enseñarle a las computadores a través de enormes volúmenes de datos, El papel de los programadores en este ámbito es crear los modelos, es decir la secuencia de pasos para que en Machine learning se pueda crear algo, y así encontrar patrones para poder predecir una acción a futuro, por ejemplo: en Netflix los usuarios reciben recomendaciones en base a las películas/series que observaron previamente.", R.drawable.ut01));
        listAreas.add(new Areas("9. Cloud computing", "La nube es una red mundial de servidores que ofrecen servicios de almacenamiento, bases de datos, redes, software, análisis e inteligencia a través de internet. Esto les permite a las empresas y usuarios pagar solamente por lo que usan, lo cual realmente es un beneficio enorme. Ya que no tienen que adquirir equipos caros y todo lo que conllevan, sino que por un pago menor pueden optar hasta por una supercomputadora.", R.drawable.ut01));

    }

}