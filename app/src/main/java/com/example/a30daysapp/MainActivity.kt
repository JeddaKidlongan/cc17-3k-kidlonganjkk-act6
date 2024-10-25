package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // Declare the adapter
    private lateinit var adapter: SelfAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Define the list of days
        val days = listOf(
            Day(1, "Start with Gratitude", "Write down three things you're grateful for.","Reflecting on what you're thankful for can boost your mood and shift your mindset to positivity.", R.drawable.day1),
            Day(2, "Move Your Body", "Do 30 minutes of physical activity.","Whether it's a walk, yoga, or dancing, moving helps release tension and boosts endorphins.", R.drawable.day2),
            Day(3, "Digital Detox", "Spend a day without social media.","Take a break from the digital noise and focus on activities that nurture your well-being.", R.drawable.day3),
            Day(4, "Hydrate", " Drink 8 glasses of water."," Proper hydration improves energy, skin health, and digestion. Carry a water bottle to help stay on track.", R.drawable.day4),
            Day(5, "Meditation", "Meditate for 10 minutes."," Find a quiet space to breathe deeply and clear your mind, promoting mental clarity and relaxation.", R.drawable.day5),
            Day(6, "Pamper Yourself", "Treat yourself to a skincare routine or take a long bath.","Taking time for self-care rituals can leave you feeling refreshed and renewed.", R.drawable.day6),
            Day(7, "Connect with Nature", "Spend 20 minutes outdoors."," Nature is a great stress reliever. Whether it's a walk in the park or sitting in your backyard, fresh air can work wonders.", R.drawable.day7),
            Day(8, "Unplug Early", " Turn off all devices an hour before bed.","Reducing screen time before bed improves sleep quality and mental rest.", R.drawable.day8),
            Day(9, "Nourish Your Body", " Eat a balanced, nutritious meal.","Focus on whole foods rich in vitamins and nutrients to fuel your body and mind.", R.drawable.day9),
            Day(10, "Read a book", "Read 20 or more pages of a book."," Escape into a good book and let your mind wander. Reading is a great way to de-stress.", R.drawable.day10),
            Day(11, "Express Creativity", " Spend time on a creative hobby.","Creative expression is a powerful outlet for emotions and can help reduce anxiety.", R.drawable.day11),
            Day(12, "Declutter Your Space", "Organize a small part of your home.","A tidy environment creates a sense of order and calm, which reflects positively on your mental state.", R.drawable.day12),
            Day(13, "Mindful Breathing", "Practice deep breathing for 5 minutes.","Slow, mindful breaths can help reduce stress and refocus your thoughts.", R.drawable.day13),
            Day(14, "Positive Affirmations", "Repeat three positive affirmations to yourself."," Affirmations help boost self-esteem and reprogram your mind toward positivity.", R.drawable.day14),
            Day(15, "Sleep Hygiene", " Set a consistent sleep schedule."," Prioritize 7-8 hours of sleep to improve your energy levels and mental clarity.", R.drawable.day15),
            Day(16, "Nurture Relationships", "Reach out to a loved one for a meaningful conversation.","Connecting with others fosters a sense of belonging and emotional support.", R.drawable.day16),
            Day(17, "Unwind with Music", "Listen to your favorite calming music.","Music has the power to soothe, uplift, or motivate, depending on your mood.", R.drawable.day17),
            Day(18, "Limit Caffeine", "Reduce your caffeine intake for the day.","Too much caffeine can increase anxiety and disrupt sleep. Switch to herbal teas if needed.", R.drawable.day18),
            Day(19, "Practice Forgiveness", "Let go of a past hurt or resentment.","Forgiving others (or yourself) can release emotional burdens and promote peace of mind.", R.drawable.day19),
            Day(20, "Journal Your Thoughts", " Write for 10 minutes about how you feel today.","Journaling is a great way to process emotions and clear mental clutter.", R.drawable.day20),
            Day(21, "Stretch It Out", "Do a 10-minute stretching routine."," Stretching can relieve muscle tension and improve flexibility, helping you feel more relaxed.", R.drawable.day21),
            Day(22, "Plan a Fun Activity", "Do something you enjoy, like a hobby or a fun outing.","Taking time for enjoyment is essential for recharging and lifting your mood.", R.drawable.day22),
            Day(23, "Prioritize Self-Compassion", "Be kind to yourself. Treat yourself as you would a friend.","Practice self-compassion by accepting mistakes and embracing imperfections.", R.drawable.day23),
            Day(24, "Spend Time in Silence", "Spend 10 minutes in complete silence.","Silence can promote mindfulness and help you reconnect with your inner thoughts.", R.drawable.day24),
            Day(25, "Volunteer or Help Someone", "Do something kind for someone else today","Helping others boosts your mood and fosters a sense of community.", R.drawable.day25),
            Day(26, "Unplug from Work", "Set boundaries with work outside of office hours.","Create a healthy work-life balance by dedicating time to rest and personal activities.", R.drawable.day26),
            Day(27, "Go Offline", " Spend the day without checking emails or social media.","A day offline gives you a chance to recharge and be present with your surroundings.", R.drawable.day27),
            Day(28, "Indulge in Comfort Food", "Prepare and enjoy your favorite comfort food."," Food can be a source of joy and comfort. Treat yourself to something you love.", R.drawable.day28),
            Day(29, "Practice Mindful Eating", "Eat a meal without distractions.","Focus on each bite, savoring the flavors and textures. Mindful eating can enhance your appreciation for food.", R.drawable.day29),
            Day(30, "Reflect and Reset", " Reflect on the past 30 days and set intentions for the future.","Take time to acknowledge your self-care journey and plan how to maintain these habits moving forward.", R.drawable.day30)
        )


        // Initialize and set the adapter
        adapter = SelfAdapter(this, days)
        recyclerView.adapter = adapter
    }
}
