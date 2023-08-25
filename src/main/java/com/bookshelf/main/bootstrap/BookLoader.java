package com.bookshelf.main.bootstrap;

import com.bookshelf.main.model.Book;
import com.bookshelf.main.repositories.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Component
public class BookLoader implements CommandLineRunner {
    public final BookRepository bookRepository;

    public BookLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBooks();
    }

    private void loadBooks() {
        if (bookRepository.count() == 0) {
            bookRepository.save(
                Book.builder()
                    .title("The Alchemist")
                    .author("Paulo Coelho")
                    .summary("Paulo Coelho's masterpiece tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined. Santiago's journey teaches us about the essential wisdom of listening to our hearts, of recognizing opportunity and learning to read the omens strewn along life's path, and, most importantly, to follow our dreams.")
                    .imageUrl("https://m.media-amazon.com/images/I/71zHDXu1TaL.jpg")
                    .publisher("HarperOne")
                    .publishDate(LocalDate.parse("2014-04-15", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            bookRepository.save(
                Book.builder()
                    .title("Prince of Thorns")
                    .author("Mark Lawrence")
                    .summary("When he was nine, he watched as his mother and brother were killed before him. At thirteen, he led a band of bloodthirsty thugs. By fifteen, he intends to be king… \nIt’s time for Prince Honorous Jorg Ancrath to return to the castle he turned his back on, to take what’s rightfully his. Since the day he hung pinned on the thorns of a briar patch and watched Count Renar’s men slaughter his mother and young brother, Jorg has been driven to vent his rage. Life and death are no more than a game to him—and he has nothing left to lose. But treachery awaits him in his father’s castle. Treachery and dark magic. No matter how fierce his will, can one young man conquer enemies with power beyond his imagining?")
                    .imageUrl("https://m.media-amazon.com/images/I/81MmE+V-PgL.jpg")
                    .publisher("Ace")
                    .publishDate(LocalDate.parse("2012-07-21", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            bookRepository.save(
                Book.builder()
                    .title("The Art of War")
                    .author("Tzu Sun")
                    .summary("Sun-tzu's Art of War is almost certainly the most famous study of strategy ever written. This treatise has been credited with influencing some of the most legendary military operations. Beyond the battlefield, people far and wide have long turned to Art of War for advice on how to succeed in various competitive situations, and companies around the world now make this book required reading for their executives. \nIn this translation, Chinese warfare scholar Ralph D. Sawyer places Art of War in its proper historical context, outlining several battles that Sun-tzu either conducted or that may have influenced him, and offers an edition that is uniquely accurate and accessible.")
                    .imageUrl("https://m.media-amazon.com/images/I/71MizulW5AL.jpg")
                    .publisher("Basic Books")
                    .publishDate(LocalDate.parse("1994-02-11", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            bookRepository.save(
                Book.builder()
                    .title("Musashi: An Epic Novel of the Samurai Era")
                    .author("Eiji Yoshikawa")
                    .summary("The classic samurai novel about the real exploits of the most famous swordsman. \nMiyamoto Musashi was the child of an era when Japan was emerging from decades of civil strife. Lured to the great Battle of Sekigahara in 1600 by the hope of becoming a samurai-without really knowing what it meant-he regains consciousness after the battle to find himself lying defeated, dazed and wounded among thousands of the dead and dying. On his way home, he commits a rash act, becomes a fugitive and brings life in his own village to a standstill-until he is captured by a weaponless Zen monk. \nThe lovely Otsu, seeing in Musashi her ideal of manliness, frees him from his tortuous punishment, but he is recaptured and imprisoned. During three years of solitary confinement, he delves into the classics of Japan and China. When he is set free again, he rejects the position of samurai and for the next several years pursues his goal relentlessly, looking neither to left nor to right. \nEver so slowly it dawns on him that following the Way of the Sword is not simply a matter of finding a target for his brute strength. Continually striving to perfect his technique, which leads him to a unique style of fighting with two swords simultaneously, he travels far and wide, challenging fighters of many disciplines, taking nature to be his ultimate and severest teacher and undergoing the rigorous training of those who follow the Way. He is supremely successful in his encounters, but in the Art of War he perceives the way of peaceful and prosperous governance and disciplines himself to be a real human being. \nHe becomes a reluctant hero to a host of people whose lives he has touched and been touched by. And, inevitably, he has to pit his skill against the naked blade of his greatest rival. \nMusashi is a novel in the best tradition of Japanese story telling. It is a living story, subtle and imaginative, teeming with memorable characters, many of them historical. Interweaving themes of unrequited love, misguided revenge, filial piety and absolute dedication to the Way of the Samurai, it depicts vividly a world Westerners know only vaguely. Full of gusto and humor, it has an epic quality and universal appeal. \nThe novel was made into a three-part movie by Director Hiroshi Inagai. For more information, visit the Shopping area.")
                    .imageUrl("https://m.media-amazon.com/images/I/81H7+mxJk9L.jpg")
                    .publisher("Kodansha International")
                    .publishDate(LocalDate.parse("2012-09-14", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            bookRepository.save(
                Book.builder()
                    .title("Dune")
                    .author("Frank Herbert")
                    .summary("Set on the desert planet Arrakis, Dune is the story of Paul Atreides—who would become known as Muad'Dib—and of a great family's ambition to bring to fruition mankind's most ancient and unattainable dream. \nA stunning blend of adventure and mysticism, environmentalism and politics, Dune won the first Nebula Award, shared the Hugo Award, and formed the basis of what is undoubtedly the grandest epic in science fiction.")
                    .imageUrl("https://m.media-amazon.com/images/I/81ym3QUd3KL.jpg")
                    .publisher("Ace")
                    .publishDate(LocalDate.parse("1990-09-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            bookRepository.save(
                Book.builder()
                    .title("The Shadow of the Gods")
                    .author("John Gwynne")
                    .summary("A century has passed since the gods fought and drove themselves to extinction. Now only their bones remain, promising great power to those brave enough to seek them out. \nAs whispers of war echo across the land of Vigrid, fate follows in the footsteps of three warriors: a huntress on a dangerous quest, a noblewoman pursuing battle fame, and a thrall seeking vengeance among the mercenaries known as the Bloodsworn. \nAll three will shape the fate of the world as it once more falls under the shadow of the gods.")
                    .imageUrl("https://m.media-amazon.com/images/I/91OAaFVVK-L.jpg")
                    .publisher("Orbit")
                    .publishDate(LocalDate.parse("2021-05-04", DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build()
            );
            System.out.println("Sample Books Loaded");
        }
    }
}