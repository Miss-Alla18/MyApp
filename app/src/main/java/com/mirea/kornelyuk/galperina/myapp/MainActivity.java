package com.mirea.kornelyuk.galperina.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mirea.kornelyuk.galperina.myapp.adapter.CategoryAdapter;
import com.mirea.kornelyuk.galperina.myapp.adapter.CourseAdapter;
import com.mirea.kornelyuk.galperina.myapp.model.Category;
import com.mirea.kornelyuk.galperina.myapp.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Мясо"));
        categoryList.add(new Category(2, "Птица"));
        categoryList.add(new Category(3,"Супы"));
        categoryList.add(new Category(4, "Салаты"));
        categoryList.add(new Category(5, "Десерты"));
        categoryList.add(new Category(6, "Выпечка"));

        setCategoryRecycler(categoryList);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "tramezzino", "Бургеры",  "Новичок", "25 минут","#F0F8C1", "Ингредиенты\n" +
                "2 фунта говяжьего фарша или 2 (10 унций) упаковки вегетарианского заменителя говяжьего фарша\n" +
                "2 больших яйца (взбитых)\n" +
                "1/4 стакана простых хлебных крошек\n" +
                "2 столовые ложки кетчупа\n" +
                "1 столовая ложка горчицы\n" +
                "1 столовая ложка лукового порошка или 1/2 маленькой луковицы (мелко нарезанной)\n" +
                "1 чайная ложка морской или кошерной соли\n" +
                "1/2 чайной ложки черного перца\n" + "-----------------------\n" +
                "Приготовление\n" +
                "Если вы используете говяжий фарш, разогрейте бройлер до высокой температуры и выровняйте сковороду с фольгой. Если вы используете вегетарианский заменитель говяжьего фарша, разогрейте духовку до 425 F и выровняйте противень с пергаментной бумагой.\n" +
                "\n" +
                "В большой миске смешайте говяжий фарш или вегетарианский заменитель говядины, яйца, панировочные сухари, кетчуп, горчицу, луковый порошок (или нарезанный лук), соль и перец. Хорошо перемешать.\n" +
                "\n" +
                "Чистыми руками сформируйте смесь в 10 пирожков, перенося каждый на подготовленную сковороду для бройлера или противень во время работы.\n" +
                "\n" +
                "Жарьте или запекайте в предварительно разогретой духовке около 8 минут с каждой стороны, до готовности. Подавайте сразу на булочках с гамбургерами с вашими любимыми начинками."));
        courseList.add(new Course(2, "thank_2", "Курица-ляв\naнги",  "Средний","1,5 часа" ,"#F0F8C1", "Ингредиенты\n" +
                "1 курица\n" +
                "150 гр очищенных грецких орехов\n" +
                "150 гр красного лука\n" +
                "1 ч. л. сливовой пасты или соуса терияки\n" +
                "½ ч. л. сумаха\n" +
                "соль, перец\n" +
                "\n" + "-----------------------\n" +
                "Приготовление\n" +
                "Орехи измельчите в блендере, но не до консистенции муки – структура должна чувствоваться.\n" +
                "\n" +
                "Лук пропустите через мясорубку или измельчите в блендере отдельно, а потом положите в марлю и выжмите из него сок.\n" +
                "\n" +
                "Смешайте лук с орехами, добавьте сливовую пасту (соус терияки). Добавьте в смесь сумах.\n" +
                "\n" +
                "Начините курицу и закройте отверстие – можно сделать это зубочистками или просто связав ножки. Если есть время, поставьте начиненную курицу на ночь в холодильник – так она лучше промаринуется.\n" +
                "\n" +
                "Выпекайте 50 минут при температуре 190 градусов."));
        courseList.add(new Course(3,"food_meat_gumbo", "Йеменский \nкуриный суп",  "Средний","2,5 часа", "#F0F8C1", "Ингредиенты\n" +
                "курица\n" +
                "4–5 среднего размера картофелин\n" +
                "1 луковица\n" +
                "приправа камун (зира) — на кончике ножа или по вкусу\n" +
                "куркума — по вкусу,\n" +
                "Черный молотый перец и соль — по вкусу\n" +
                "\n" + "-----------------------\n" +
                "Приготовление\n" +
                "Курицу разрезать на порционные куски и залить водой. В воду для супа добавить нарезанную четвертинками луковицу, и варить на медленном огне два часа.\n" +
                "\n" +
                "Минут за сорок до окончания варки, положить в кастрюлю разрезанные пополам картофелины и всыпать специи. (За счет куркумы суп моментально приобретет богатый янтарный цвет)."));
        courseList.add(new Course(4, "food_big_salad", "Салат «Табуле»\n с петрушкой",  "Новичок","25 минут", "#F0F8C1", "Ингредиенты\n" +
                "200 г кускуса\n" +
                "300 г помидор\n" +
                "Зелень по вкусу\n" +
                "1 шт лимона\n" +
                "5 столовых ложек оливкового масла\n" +
                "Соль, перец по вкусу\n" +
                "по вкусу\n" +
                "Приготовление\n" + "-----------------------\n" +
                "Кускус залить кипятком и оставить минут на 20.\n" +
                "Нарезать помидоры. Порубить зеленый лук и петрушку (без стеблей).\n" +
                "Смешать петрушку, лук, помидоры и кускус. Заправить салат 4–5 столовыми ложками оливкового масла и выжать сок половины лимона.\n" + " Посолить, поперчить и отправить в холодильник, чтобы салат пропитался.\n" + "Можно добавить дольки лимона как для декора, так и для вкуса." ));
        courseList.add(new Course(5, "flambyxvi", "Еврейский \nяблочный пирог",  "Средний", "1,5 часа","#F0F8C1", "Ингредиенты:\n"+" 1/2 Стакана fпельсинового сокa\n"+"4 шт яйца\n"+"2 чайные ложки ванили\n"+
                "1 чайная ложка порошка для выпечки\n"+"8 штук яблок\n"+"2 чайные ложки корицы\n"+"-----------------------\n" +
                "Приготовление\n"+
                " Взбить яйца, смешать с маслом и апельсиновым соком. Добавить муки, 2 стакана сахара и порошок для выпечки.\n"+
                " Затем добавить ванилин. Почистить и нарезать яблоки небольшими ломтиками. Смешать фрукты с корицей и 1/2 стакана сахара.\n"+
                " Залить 1/2 теста в смазанную форму для выпечки. Выложить яблочную смесь поверх. Затем нужно накрыть начинку оставшимся тестом.\n"+
                " Выпекать при температуре 170 около 1 чаcа" ));
        courseList.add(new Course(6, "mincemeat_pie", "Нежная \nтворожная запеканка", "Средний","1,5 часа", "#F0F8C1", "Ингредиенты\n" +
                "750 гр гвина левана \n" +
                "3 шт яйца\n" +
                "3 ст. ложки кукурузой муки\n" +
                "1,5 ст. ложки сахара\n" +
                "1 пакетикэкстракт ванили (ванильный сахар) \n" +
                "Любые сухофрукты (я люблю сушеную вишню) или ягоды\n" +
                "\n" +
                "Приготовление\n" + "-----------------------\n" +
                "Все смешать, форму застелить пергаментом, чуть смазать растительным маслом.\n" + "Выпекать в заранее разогретой духовке (160-180), 30-40 минут, в зависимости от духовки.\n" +
                "\n" +
                "Готовность проверить сухим ножом или зубочисткой. Они должны остаться сухими." ));

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}