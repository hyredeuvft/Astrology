package com.example.astrology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutZodiacSign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_zodiac_sign);

        ConstraintLayout titleConstraint = (ConstraintLayout) findViewById(R.id.TitleConstr);
        titleConstraint.setBackgroundResource(R.drawable.starrysky);
        ImageView circleZodiac = (ImageView) findViewById(R.id.circleZodiac);
        ImageView infoimage = (ImageView) findViewById(R.id.InfoImage);
        TextView infotext = (TextView) findViewById(R.id.Infotext);
        Button btnAquarius = (Button) findViewById(R.id.btnAquarius);
        Button btnAires = (Button) findViewById(R.id.btnAires);
        ImageView Title = (ImageView) findViewById(R.id.Title);
        Title.setBackgroundResource(R.drawable.astrology);
        Button btnTaurus = (Button) findViewById(R.id.btnTaurus);
        Button btnGemini = (Button) findViewById(R.id.btnGemini);
        Button btnCancer = (Button) findViewById(R.id.btnCancer);
        Button btnLeo = (Button) findViewById(R.id.btnLeo);
        Button btnVirgo = (Button) findViewById(R.id.btnVirgo);
        Button btnLibra = (Button) findViewById(R.id.btnLibra);
        Button btnScorpio = (Button) findViewById(R.id.btnScorpio);
        Button btnSagittarius = (Button) findViewById(R.id.btnSagittarius);
        Button btnCapricorn = (Button) findViewById(R.id.btnCapricorn);
        Button btnPisces = (Button) findViewById(R.id.btnPisces);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.VISIBLE);
                btnAquarius.setVisibility(View.VISIBLE);
                btnAires.setVisibility(View.VISIBLE);
                btnCapricorn.setVisibility(View.VISIBLE);
                btnCancer.setVisibility(View.VISIBLE);
                btnGemini.setVisibility(View.VISIBLE);
                btnLeo.setVisibility(View.VISIBLE);
                btnLibra.setVisibility(View.VISIBLE);
                btnPisces.setVisibility(View.VISIBLE);
                btnSagittarius.setVisibility(View.VISIBLE);
                btnScorpio.setVisibility(View.VISIBLE);
                btnTaurus.setVisibility(View.VISIBLE);
                btnVirgo.setVisibility(View.VISIBLE);
                infoimage.setVisibility(View.GONE);
                infotext.setVisibility(View.GONE);
                btnCancel.setVisibility(View.GONE);

            }
        });

        btnAires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.aries);
                infotext.setText("Овен - амбициозный, независимый, нетерпеливый\n" +
                        "\n" +
                        "Овен, знак стихии Огня, открывает новый зодиакальный цикл, относится к стихии Огня, обладает особенной харизмой (качеством) первооткрывателя, инициативой и целеустремленностью. Даже обладающие спокойным темпераментом, Овны никогда не забывают про свои цели и, как правило, рано или поздно достигают желаемого. Инициатива и активность представителей этого знака позволяет находить новые задачи, которые Овен ставит перед своими последователями.\n" +
                        "\n" +
                        "Загореться идеей и зажечь ее огонь для других для Овна важнее, чем довести дело до конца. Рутинные обязанности, последовательность и педантичность — не являются сильными чертами этого знака. Напор, кратковременное мощное усилие, поиск цели и разведка боем — вот что выгодно отличает Овна от других знаков зодиака.");
            }
        });

        btnTaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.taurus);
                infotext.setText("Телец - основательный, музыкальный, практичный\n" +
                        "\n" +
                        "Фиксированный знак стихии Земли, созидатель и гурман, Телец воплощает собой принцип любви к жизни и ее благам, а также имеет качества упорства и практичности. Телец умеет и любит работать, терпеливо создает себе комфортные условия для жизни. Способен долго и терпеливо ждать созревания подходящих условий. Терпение Тельца удивительно, ему трудно учиться чему-то новому и приспосабливаться к незнакомым условиям.\n" +
                        "\n" +
                        "Очень восприимчив ко всему прекрасному, обладает сильной интуицией, склонен анализировать ситуацию, прежде, чем совершать поступки. Дар Тельца — воплощать красивые мечты в реальность.");
            }
        });

        btnGemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.gemini);
                infotext.setText("Близнецы - любопытный, нежный, добрый\n" +
                        "\n" +
                        "Знак подвижного креста стихии Воздуха. Близнецы обладают сильным характером, энергичны, независимы и общительны. Коммуникабельны, с веселым характером и темпераментным любопытством. Близнецы легко устанавливают связи со множеством разноплановых людей. Интересные эрудированные собеседники, темпераментные и неутомимые, Близнецы живут активной и насыщенной жизнью, легко приспосабливаются к любой обстановке. Обеспечивают связи и потоки информации между людьми.");
            }
        });

        btnCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.cancer);
                infotext.setText("Рак - интуитивный, эмоциональный, умный, страстный\n" +
                        "\n" +
                        "Знак стихии Воды находится под покровительством ночного светила. Управление Луны влияет на характер представителей этого знака, делая их ранимыми и чувствительными людьми. Луна и водная стихия знака дают Раку способность к эмпатии, возможность мгновенно угадывать мысли и чаяния других людей. Это решительные и благородные люди, часто патриоты. Но если жизнь Рака была полна лишений и несправедливости с детства, то обладают коварством и харизмой гангстера.\n" +
                        "\n" +
                        "Влияют на других людей, могут подчинить себе ради достижения общей цели или выживания. Жесткие и проницательные руководители.");
            }
        });

        btnLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.leo);
                infotext.setText("Лев - горделивый, самоуверенный\n" +
                        "\n" +
                        "Фиксированный знак стихии Огня, Лев обладает даром созидания и настойчивостью в достижении своих целей. Это деятельный человек, стремящийся к успеху и популярности. Сильная, чувствительная и любящая натура, часто попадает под влияние эмоций и чувств. Лев великодушен, решителен и храбр. Самообладание и амбициозность являются сильными чертами этого знака. Не равнодушен к вниманию, лести и роскоши.");
            }
        });

        btnVirgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.virgo);
                infotext.setText("Дева - элегантный, организованный, добрый\n" +
                        "\n" +
                        "Дева — второй знак стихии Земли, олицетворяющий справедливость и чистоту. Дева воплощает принцип порядка, победу разума над чувствами, умение видеть целое в деталях. Дева больше других знаков зодиака стремится к совершенству во всем, учится всю жизнь, но также учит и других. Стремление к лучшему заставляет Деву подмечать изъяны во всем, что ее окружает, что требует исправления.");
            }
        });

        btnLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.libra);
                infotext.setText("Весы - дипломатичный, артистичный, интеллигентный\n" +
                        "\n" +
                        "Единственный неодушевленный символ в зодиакальном круге, Весы являются вторым знаком стихии Воздуха. Отличительной чертой представителей этого знака является стремление к гармонии во всем. Чувствительные к прекрасному, прирожденные дипломаты, обладающие стойкостью духа и несгибаемой волей к победе в любом соперничестве, Весы часто выступают в роли судей, а также юристов на всех уровнях. Постоянство, надежность и созидательная сила — лучшие качества этого знака.");
            }
        });

        btnScorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.scorpio);
                infotext.setText("Скорпион - чарующий, страстный, независимый\n" +
                        "\n" +
                        "Скорпион фиксированный знак стихии Воды. Скорпион обладает природным магнетизмом и сильным характером. Выносливый, сдержанный в словах и эмоциях, Скорпион умеет хранить секреты и ценит верность. Скорпион — это знак внутренних изменений, преодоления слабости, борьбы до победного конца. Рожденный под этим знаком всю жизнь совершенствуется сам и стремится изменить мир к лучшему.");
            }
        });

        btnSagittarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.sagittarius);
                infotext.setText("Стрелец - авантюрный, творческий, волевой\n" +
                        "\n" +
                        "Стрелец — знак стихии Огня, обладает ярко выраженной харизмой лидера, стремится к образованию, энергичен и увлечен идеей изменить весь мир. Всю жизнь Стрелец стремится к популярности, к высокой оценке своей работы и достижений со стороны близких людей. Стрелец почти всегда добивается успеха хотя бы в одном из многочисленных видов своей деятельности. У энергичного по натуре Стрельца обычно несколько специальностей, широкий спектр интересов и деловых связей.\n" +
                        "\n" +
                        "Свой бизнес, участие в общественной жизни нередко сопровождаются преподавательской или политической деятельностью.");
            }
        });

        btnCapricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.capricorn);
                infotext.setText("Козерог - дотошный, умный, деятельный\n" +
                        "\n" +
                        "Знак Земной стихии, Козерог обладает даром не терять из виду главную цель и долго жить. Целеустремленность, стойкость в трудностях, ответственность — это сильные качества представителей этого знака. Козерог не боится одиночества, готов переносить любые житейские трудности, преодолеть любые препятствия. Свои глубокие чувства предпочитает никому не открывать, с трудом близко сходится с людьми и не любит терять дружеские связи. Если Козерогом кто-то пренебрег, то никогда не прощает и не возвращается.\n" +
                        "\n" +
                        "Но всегда готов оказать немалую помощь на деле, даже если не знаком с человеком лично. Основной целью типичного Козерога является достижение максимально высокого ранга относительно условий личного старта.");
            }
        });

        btnAquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.aquarius);
                infotext.setText("Водолей - одаренный воображением, идеалистический, интуитивный\n" +
                        "\n" +
                        "Знак фиксированного креста стихии Воздуха — Водолей изменчив по натуре, но не любит перемены, полон противоречий. Яркий индивидуалист, Водолей склонен к перепадам настроения, то элегантен, то неряшлив, страдает отсутствием самодисциплины, решителен и обладает ярким темпераментом. Не выносит рутины и скучных обязанностей. Независимость — как главное условие деятельности.");
            }
        });

        btnPisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleZodiac.setVisibility(View.GONE);

                btnAquarius.setVisibility(View.GONE);
                btnAires.setVisibility(View.GONE);
                btnCapricorn.setVisibility(View.GONE);
                btnCancer.setVisibility(View.GONE);
                btnGemini.setVisibility(View.GONE);
                btnLeo.setVisibility(View.GONE);
                btnLibra.setVisibility(View.GONE);
                btnPisces.setVisibility(View.GONE);
                btnSagittarius.setVisibility(View.GONE);
                btnScorpio.setVisibility(View.GONE);
                btnTaurus.setVisibility(View.GONE);
                btnVirgo.setVisibility(View.GONE);

                infoimage.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
                infotext.setVisibility(View.VISIBLE);
                infoimage.setBackgroundResource(R.drawable.pisces);
                infotext.setText("Рыбы - творческий, чувствительный, артистичный\n" +
                        "\n" +
                        "Рыбы закрывают зодиакальный круг, представляя собой знак стихии Воды. Это мудрые и восприимчивые люди, отзывчивость которых часто приводит их к общению с манипуляторами. Подверженность чужому влиянию, высочайшая среди знаков зодиака способность к адаптации в любой окружающей обстановке, стойкость перед житейскими трудностями отличает типичных Рыб.\n" +
                        "\n" +
                        "Хорошо развитая от природы интуиция позволяет Рыбам приспособиться к любому общественному порядку, быть своим в любой среде, находить наилучшие выходы из затруднительных положений и устанавливать деловые связи с неизменной выгодой для себя.");
            }
        });


    }
}