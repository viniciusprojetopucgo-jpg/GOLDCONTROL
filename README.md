
## 💎 **GOLD CONTROL | Gestão & Catálogo de Joias** 💎

Uma solução Fullstack completa para o setor de joalheria, unindo um sistema de gestão de inventário robusto a um catálogo digital elegante e automatizado. O projeto foi desenhado para operar com **Custo Zero ($0)**, utilizando o máximo potencial de infraestruturas cloud gratuitas e automações inteligentes.

## 🚀 Diferenciais do Projeto
* **Custo Zero de Operação:** Todo o ecossistema (Hospedagem, Banco de Dados, Automação e API) roda em camadas gratuitas (Free Tier).
* **Automação de Vendas:** Integração com bot de WhatsApp para transição direta do catálogo para o fechamento de venda e compra de ouro.
* **Sincronização em Tempo Real:** Alterações no painel administrativo refletem instantaneamente no catálogo público.

## 🛠️ Stack Tecnológica
* **Frontend:** HTML5, CSS3 (Design Responsivo Premium) e JavaScript Vanilla.
* **Backend:** Java Spring Boot (Arquitetura RESTful).
* **Banco de Dados:** PostgreSQL (Hospedado via Railway).
* **Automação:** n8n para orquestração de fluxos e notificações.
* **Infraestrutura:** Railway (Deploy Contínuo via GitHub) e AWS (IAM/EC2 para serviços auxiliares).

## 🤖 Automação & IA
O projeto conta com uma camada de automação via **n8n** que permite:
1.  **Captura de Leads:** Botão "Tenho Interesse" que gera mensagens estruturadas para o WhatsApp.
2.  **Transcrições Inteligentes:** Uso do `Fluxo Inteligente Criado Por Vinícius Panisio Bichule` para processar mensagens de voz de clientes (via Whisper/OpenAI).

## 📂 Estrutura de Pastas
* `/src/main/resources/static`: Contém o Catálogo Público e o Painel de Gestão.
* `/src/main/java`: Lógica de negócio e endpoints da API.
