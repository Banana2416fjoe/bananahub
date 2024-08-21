local Fluent = loadstring(game:HttpGet("https://github.com/dawid-scripts/Fluent/releases/latest/download/main.lua"))()
local SaveManager = loadstring(game:HttpGet("https://raw.githubusercontent.com/dawid-scripts/Fluent/master/Addons/SaveManager.lua"))()
local InterfaceManager = loadstring(game:HttpGet("https://raw.githubusercontent.com/dawid-scripts/Fluent/master/Addons/InterfaceManager.lua"))()

local Window = Fluent:CreateWindow({
    Title = "Banana Hub",
    SubTitle = "by Joe",
    TabWidth = 110,
    Size = UDim2.fromOffset(410, 350),
    Acrylic = true,
    Theme = "Dark",
    MinimizeKey = Enum.KeyCode.RightControl
})

local ScreenGui = Instance.new("ScreenGui")
    ScreenGui.Name = "MyScreenGui"
    ScreenGui.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
    ScreenGui.Parent = game.CoreGui

local ImageButton = Instance.new("ImageButton")
    ImageButton.Name = "MyImageButton"
    ImageButton.BackgroundColor3 = Color3.fromRGB(255, 255, 255)  -- White background
    ImageButton.BorderSizePixel = 0
    ImageButton.AnchorPoint = Vector2.new(0, 0)
    ImageButton.Position = UDim2.new(0.02, 0, 0.02, 0)
    ImageButton.Draggable = true
    ImageButton.Size = UDim2.new(0, 40, 0, 40)  -- Make the size square to ensure the circle shape
    ImageButton.Image = "http://www.roblox.com/asset/?id=16024431693"  -- Circular image
    ImageButton.ImageColor3 = Color3.fromRGB(255, 255, 255)
    ImageButton.ScaleType = Enum.ScaleType.Fit
    ImageButton.ClipsDescendants = true
    
    -- Adding UICorner to make it circular
    local UICorner = Instance.new("UICorner")
    UICorner.CornerRadius = UDim.new(0.5, 0)  -- Creates a circular shape
    UICorner.Parent = ImageButton

    ImageButton.Parent = ScreenGui

ImageButton.MouseButton1Down:Connect(function()
    game:GetService("VirtualInputManager"):SendKeyEvent(true, Enum.KeyCode.RightControl, false, game)
end)

-- Definindo abas
local Tabs = {
    Main = Window:AddTab({ Title = "Main", Icon = "home" }),
    Universal = Window:AddTab({ Title = "Universal", Icon = "settings" }),
    ALL_STAR_TOWER_DEFENSE = Window:AddTab({ Title = "ALL STAR TOWER DEFENSE", Icon = "gamepad" }),
    AUniversalTime = Window:AddTab({ Title = "A Universal Time", Icon = "gamepad" }),
    AOnePieceGame = Window:AddTab({ Title = "A One Piece Game", Icon = "gamepad" }),
    AnimeAdventures = Window:AddTab({ Title = "Anime Adventures", Icon = "gamepad" }),
    AnimeChampions = Window:AddTab({ Title = "Anime Champions", Icon = "gamepad" }),
    AnimeClash = Window:AddTab({ Title = "Anime Clash", Icon = "gamepad" }),
    AnimeDefenders = Window:AddTab({ Title = "Anime Defenders", Icon = "gamepad" }),
    AnimeDimensions = Window:AddTab({ Title = "Anime Dimensions", Icon = "gamepad" }),
    AnimeFighters = Window:AddTab({ Title = "Anime Fighters", Icon = "gamepad" }),
    AnimeFightingX = Window:AddTab({ Title = "Anime Fighting X", Icon = "gamepad" }),
    AnimeLastStand = Window:AddTab({ Title = "Anime Last Stand", Icon = "gamepad" }),
    AnimeLeague = Window:AddTab({ Title = "Anime League", Icon = "gamepad" }),
    AnimePowerEvolution = Window:AddTab({ Title = "Anime Power Evolution", Icon = "gamepad" }),
    AnimeRifts = Window:AddTab({ Title = "Anime Rifts", Icon = "gamepad" }),
    AnimeStrikeSimulator = Window:AddTab({ Title = "Anime Strike Simulator", Icon = "gamepad" }),
    AnimeWarriors = Window:AddTab({ Title = "Anime Warriors", Icon = "gamepad" }),
    BladeBall = Window:AddTab({ Title = "Blade Ball", Icon = "gamepad" }),
    BloxFruits = Window:AddTab({ Title = "Blox Fruits", Icon = "gamepad" }),
    BreakIn = Window:AddTab({ Title = "Break In", Icon = "gamepad" }),
    Brookhaven = Window:AddTab({ Title = "Brookhaven", Icon = "gamepad" }),
    DemonFall = Window:AddTab({ Title = "Demon Fall", Icon = "gamepad" }),
    Doors = Window:AddTab({ Title = "Doors", Icon = "gamepad" }),
    DUNGEONQUEST = Window:AddTab({ Title = "DUNGEON QUEST", Icon = "gamepad" }),
    FieldTripZ = Window:AddTab({ Title = "Field Trip Z", Icon = "gamepad" }),
    GymLeague = Window:AddTab({ Title = "Gym League", Icon = "gamepad" }),
    HazePiece = Window:AddTab({ Title = "Haze Piece", Icon = "gamepad" }),
    HonkaiStarRailSimulator = Window:AddTab({ Title = "Honkai Star Rail Simulator", Icon = "gamepad" }),
    ImposibleLadderClimbObby = Window:AddTab({ Title = "Impossible Ladder Climb Obby!", Icon = "gamepad" }),
    MemeSea = Window:AddTab({ Title = "Meme Sea", Icon = "gamepad" }),
    MuscleLegends = Window:AddTab({ Title = "Muscle Legends", Icon = "gamepad" }),
    MurderMystery2 = Window:AddTab({ Title = "Murder Mystery 2", Icon = "gamepad" }),
    PetSimulator99 = Window:AddTab({ Title = "Pet Simulator 99", Icon = "gamepad" }),
    ProjectSlayer = Window:AddTab({ Title = "Project Slayer", Icon = "gamepad" }),
    Reaper2 = Window:AddTab({ Title = "Reaper 2", Icon = "gamepad" }),
    Re:Xl = Window:AddTab({ Title = "Re:Xl", Icon = "gamepad" }),
    RealmRampage = Window:AddTab({ Title = "Realm Rampage", Icon = "gamepad" }),
    SkibidiTowerDefense = Window:AddTab({ Title = "Skibidi Tower Defense", Icon = "gamepad" }),
    SlapBattles = Window:AddTab({ Title = "Slap Battles", Icon = "gamepad" }),
    SolsRNG = Window:AddTab({ Title = "Sol's RNG", Icon = "gamepad" }),
    StandUpright = Window:AddTab({ Title = "Stand Upright", Icon = "gamepad" }),
    TheStrongestBattlegrounds = Window:AddTab({ Title = "The Strongest Battlegrounds", Icon = "gamepad" }),
    ToiletTowerDefense = Window:AddTab({ Title = "Toilet Tower Defense", Icon = "gamepad" }),
    TowerDefenseSimulator = Window:AddTab({ Title = "Tower Defense Simulator", Icon = "gamepad" }),
    TowerOfHell = Window:AddTab({ Title = "Tower of Hell", Icon = "gamepad" }),
    Tradelands = Window:AddTab({ Title = "Tradelands", Icon = "gamepad" }),
    Westbound = Window:AddTab({ Title = "Westbound", Icon = "gamepad" }),
    WeakLegacy2 = Window:AddTab({ Title = "Weak Legacy 2", Icon = "gamepad" }),
    ZombieUprising = Window:AddTab({ Title = "Zombie Uprising", Icon = "gamepad" })
}


Fluent:Notify({
    Title = "Banana Hub",
    Content = "Banana Hub Loaded",
    Duration = 5
})

-- Main Tab
local MainTab = Tabs.Main

MainTab:AddButton({
    Title = "Rejoin Server",
    Callback = function()
        Window:Dialog({
            Title = "Confirmation",
            Content = "Are you sure you want to rejoin the server?",
            Buttons = {
                {
                    Title = "Confirm",
                    Callback = function()
                        local ts = game:GetService("TeleportService")
                        local p = game:GetService("Players").LocalPlayer
                        ts:Teleport(game.PlaceId, p)
                    end
                },
                {
                    Title = "Cancel",
                    Callback = function()
                        print("Cancelled rejoining server.")
                    end
                }
            }
        })
    end
})

MainTab:AddButton({
    Title = "Unc Test",
    Callback = function()
        Window:Dialog({
            Title = "Confirmation",
            Content = "Are you sure you want to execute Unc Test?",
            Buttons = {
                {
                    Title = "Confirm",
                    Callback = function()
                        loadstring(game:HttpGet("https://github.com/ltseverydayyou/uuuuuuu/blob/main/UNC%20test?raw=true"))()
                    end
                },
                {
                    Title = "Cancel",
                    Callback = function()
                        print("Cancelled executing Unc Test.")
                    end
                }
            }
        })
    end
})

MainTab:AddButton({
    Title = "Kick Self",
    Callback = function()
        Window:Dialog({
            Title = "Confirmation",
            Content = "Are you sure you want to kick yourself?",
            Buttons = {
                {
                    Title = "Confirm",
                    Callback = function()
                        game.Players.LocalPlayer:Kick("You Have Been Kicked")
                    end
                },
                {
                    Title = "Cancel",
                    Callback = function()
                        print("Cancelled kicking self.")
                    end
                }
            }
        })
    end
})

MainTab:AddButton({
    Title = "Destroy Banana Hub",
    Callback = function()
        Window:Dialog({
            Title = "Confirmation",
            Content = "Are you sure you want to destroy Banana Hub?",
            Buttons = {
                {
                    Title = "Confirm",
                    Callback = function()
                        Fluent:Destroy()
                    end
                },
                {
                    Title = "Cancel",
                    Callback = function()
                        print("Cancelled destroying Banana Hub.")
                    end
                }
            }
        })
    end
})

MainTab:AddSlider("Walkspeed", {
    Title = "Walkspeed",
    Min = 0,
    Max = 300,
    Default = 30,
    Rounding = 1,
    Callback = function(Value)
        game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = Value
    end
})

MainTab:AddSlider("JumpPower", {
    Title = "Jump Power",
    Min = 0,
    Max = 300,
    Default = 10,
    Rounding = 1,
    Callback = function(Value)
        game.Players.LocalPlayer.Character.Humanoid.JumpPower = Value
    end
})

-- Anime Dimensions Tab
local AnimeDimensionsTab = Tabs.AnimeDimensions
AnimeDimensionsTab:AddButton({
    Title = "Script CrazyDay",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Anime_Dimension_Simulator'))()
    end
})

-- Blade Ball Tab
local BladeBallTab = Tabs.BladeBall
BladeBallTab:AddButton({
    Title = "Redz Hub",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/REDzHUB/BladeBall/main/eng"))()
    end
})

BladeBallTab:AddButton({
    Title = "ScoutX",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/Kozukiremboukk/Aqui-mesml/main/blades"))()
    end
})

BladeBallTab:AddButton({
    Title = "Neon C",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/Neoncat765/Neon.C-Hub-V5/main/UpdatedVersion"))()
    end
})

BladeBallTab:AddButton({
    Title = "NoHaxV3",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/r4mpage4/NoHaxV3/main/BladeBallNoHax%20V3"))()
    end
})

-- Blox Fruits Tab
local BloxFruitsTab = Tabs.BloxFruits
BloxFruitsTab:AddButton({
    Title = "Auto Chest",
    Callback = function()
        _G.JoinTeam = "Marines"
        _G.Stop_If_Has_Items = true
        loadstring(game:HttpGet("https://github.com/PNguyen0199/Script/raw/main/Trash_Auto_Chest.lua"))()
    end
})

BloxFruitsTab:AddButton({
    Title = "Ninja Hub Azure",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/Xero2409/NinjaHub/main/ninjahub.lua"))()
    end
})

BloxFruitsTab:AddButton({
    Title = "Ninja Hub Hoho",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/acsu123/NinjaHub/main/LoaderBloxFruit.lua"))()
    end
})

BloxFruitsTab:AddButton({
    Title = "Redz9999",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/REDzHUB/BloxFruits/main/redz9999"))()
    end
})

BloxFruitsTab:AddButton({
    Title = "Vector Hub",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/AAwful/VectorHub/main/Loader.lua"))()
    end
})

BloxFruitsTab:AddButton({
    Title = "W-Azure V2",
    Callback = function()
        getgenv().Team = "Marines"
        getgenv().AutoLoad = true
        getgenv().SlowLoadUi = false
        getgenv().ForceUseSilentAimDashModifier = false
        getgenv().ForceUseWalkSpeedModifier = false
        loadstring(game:HttpGet("https://api.luarmor.net/files/v3/loaders/3b2169cf53bc6104dabe8e19562e5cc2.lua"))()
    end
})

-- BrookHaven Tab
local BrookHavenTab = Tabs.BrookHaven
BrookHavenTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/BrookHaven'))()
    end
})

-- Break In Tab
local BreakInTab = Tabs.BreakIn
BreakInTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Break_In'))()
    end
})

-- Demon Fall Tab
local DemonFallTab = Tabs.DemonFall
DemonFallTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Demon_Fall'))()
    end
})

-- Derelict Tab
local DerelictTab = Tabs.Derelict
DerelictTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Derelict'))()
    end
})

-- Dungeon Quest Tab
local DungeonQuestTab = Tabs.DungeonQuest
DungeonQuestTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Dungeon_Quest'))()
    end
})

-- Doors Tab
local DoorsTab = Tabs.Doors
DoorsTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Doors'))()
    end
})

-- Every Second You Get +1 Jump Power Tab
local EverySecondYouGetTab = Tabs.EverySecondYouGet
EverySecondYouGetTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Every_Second_You_Get'))()
    end
})

-- Field Trip Z Tab
local FieldTripZTab = Tabs.FieldTripZ
FieldTripZTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Field_Trip_Z'))()
    end
})

-- Gym League Tab
local GymLeagueTab = Tabs.GymLeague
GymLeagueTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Gym_League'))()
    end
})

-- Haze piece Tab
local HazePieceTab = Tabs.HazePiece
HazePieceTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Haze_Piece'))()
    end
})

-- Honkai Star Rail Simulator Tab
local HonkaiStarRailSimulatorTab = Tabs.HonkaiStarRailSimulator
HonkaiStarRailSimulatorTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Honkai_Star_Rail_Simulator'))()
    end
})

-- Impossible Ladder Climb Obby! Tab
local ImpossibleLadderClimbObbyTab = Tabs.ImpossibleLadderClimbObby
ImpossibleLadderClimbObbyTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Impossible_Ladder_Climb_Obby'))()
    end
})

-- King Legacy Tab
local KingLegacyTab = Tabs.KingLegacy
KingLegacyTab:AddButton({
    Title = "BT Hub",
    Callback = function()
        loadstring(game:HttpGetAsync("https://lua-library.btteam.net/script-auth.txt"))()
    end
})

-- Meme Sea Tab
local MemeSeaTab = Tabs.MemeSea
MemeSeaTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Meme_Sea'))()
    end
})

-- Muscle Legends Tab
local MuscleLegendsTab = Tabs.MuscleLegends
MuscleLegendsTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Muscle_Legends'))()
    end
})

-- Murder Mystery 2 Tab
local MurderMystery2Tab = Tabs.MurderMystery2
MurderMystery2Tab:AddButton({
    Title = "Symphony Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/ThatSick/ArrayField/main/SymphonyHub.lua'))()
    end
})

-- Pet Catchers Tab
local PetCatchersTab = Tabs.PetCatchers
PetCatchersTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Pet_Catchers'))()
    end
})

-- Pet Simulator 99 Tab
local PetSimulator99Tab = Tabs.PetSimulator99
PetSimulator99Tab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Pet_Simulator_99'))()
    end
})

-- ProjectSlayer Tab
local ProjectSlayerTab = Tabs.ProjectSlayer
ProjectSlayerTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/ProjectSlayer'))()
    end
})

-- Re:Xl Tab
local ReXlTab = Tabs.ReXl
ReXlTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Re_Xl'))()
    end
})

-- Reaper 2 Tab
local Reaper2Tab = Tabs.Reaper2
Reaper2Tab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Reaper_2'))()
    end
})

-- Realm Rampage Tab
local RealmRampageTab = Tabs.RealmRampage
RealmRampageTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Realm_Rampage'))()
    end
})

-- Simple Steps Tab
local SimpleStepsTab = Tabs.SimpleSteps
SimpleStepsTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Simple_Steps'))()
    end
})

-- Skibidi Tower Defense Tab
local SkibidiTowerDefenseTab = Tabs.SkibidiTowerDefense
SkibidiTowerDefenseTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Skibidi_Tower_Defense'))()
    end
})

-- Slap Battles Tab
local SlapBattlesTab = Tabs.SlapBattles
SlapBattlesTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Slap_Battles'))()
    end
})

-- Sol's RNG Tab
local SolsRNGTab = Tabs.SolsRNG
SolsRNGTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Sols_RNG'))()
    end
})

-- Stand Upright Tab
local StandUprightTab = Tabs.StandUpright
StandUprightTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Stand_Upright'))()
    end
})

-- Steve's One Piece Tab
local StevesOnePieceTab = Tabs.StevesOnePiece
StevesOnePieceTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Steves_One_Piece'))()
    end
})

-- Steep Steps Tab
local SteepStepsTab = Tabs.SteepSteps
SteepStepsTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Steep_Steps'))()
    end
})

-- Skywars/Bedwars Tab
local SkywarsBedwarsTab = Tabs.SkywarsBedwars
SkywarsBedwarsTab:AddButton({
    Title = "Vape V4",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/7GrandDadPGN/VapeV4ForRoblox/main/NewMainScript.lua", true))()
    end
})

SkywarsBedwarsTab:AddButton({
    Title = "Nexus",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/s-o-a-b/nexus/main/loadstring"))()
    end
})

-- Street Soccer 3v3 Tab
local StreetSoccer3v3Tab = Tabs.StreetSoccer3v3

-- Create a toggle button for ball collection
StreetSoccer3v3Tab:AddToggle("GetBallToggle", {
    Title = "Get Ball",
    Default = false,
    Callback = function(Value)
        _G.GetBallToggle = Value
        while _G.GetBallToggle do
            local remote = game:GetService("ReplicatedStorage"):FindFirstChild("Remotes") and 
                           game:GetService("ReplicatedStorage").Remotes:FindFirstChild("Collect")

            if remote then
                pcall(function()
                    remote:FireServer(6.2691330909729)
                end)
            else
                warn("ReplicatedStorage.Remotes.Collect not found")
            end

            wait(0.1)  -- Adjust delay as needed
        end
    end
})
-- Create a slider for controlling the Walkspeed
StreetSoccer3v3Tab:AddSlider("Walkspeed", {
    Title = "Walkspeed",
    Min = 0,
    Max = 33,
    Default = 16,
    Rounding = 1,
    Callback = function(Value)
        if game.Players.LocalPlayer.Character and game.Players.LocalPlayer.Character:FindFirstChild("Humanoid") then
            game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = Value
        end
    end
})

-- Toilet Tower Defense Tab
local ToiletTowerDefenseTab = Tabs.ToiletTowerDefense
ToiletTowerDefenseTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Toilet_Tower_Defense'))()
    end
})

-- Tower Defense Simulator Tab
local TowerDefenseSimulatorTab = Tabs.TowerDefenseSimulator
TowerDefenseSimulatorTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Tower_Defense_Simulator'))()
    end
})

-- Tower of Hell Tab
local TowerOfHellTab = Tabs.TowerOfHell
TowerOfHellTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Tower_of_Hell'))()
    end
})

-- Tradelands Tab
local TradelandsTab = Tabs.Tradelands
TradelandsTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Tradelands'))()
    end
})

-- TPS Tab
local TPSTab = Tabs.TPS
TPSTab:AddButton({
    Title = "Reach n React",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/DDIBASAAIB/tpsfreescript/main/obfsctpsfree.lua"))()
    end
})

--The Strongest Battegrounds Tab
local TSBTab = Tabs.TSB

TSBTab:AddButton({
    Title = "Tsb and RR",
    Callback = function()
        loadstring(game:HttpGet("https://rawscripts.net/raw/Universal-Script-BEST-TSB-SCRIPT-TAMHUB-GOJO-17125"))()
    end
})

-- Universal Tab
local UniversalTab = Tabs.Universal

UniversalTab:AddButton({
    Title = "Anti Lag",
    Callback = function()
        -- Settings for anti-lag
        _G.Settings = {
            Players = {
                ["Ignore Me"] = true, -- Ignore your Character
                ["Ignore Others"] = true-- Ignore other Characters
            },
            Meshes = {
                Destroy = false, -- Destroy Meshes
                LowDetail = true -- Low detail meshes (NOT SURE IT DOES ANYTHING)
            },
            Images = {
                Invisible = true, -- Invisible Images
                LowDetail = false, -- Low detail images (NOT SURE IT DOES ANYTHING)
                Destroy = false, -- Destroy Images
            },
            ["No Particles"] = true, -- Disables all ParticleEmitter, Trail, Smoke, Fire and Sparkles
            ["No Camera Effects"] = true, -- Disables all PostEffect's (Camera/Lighting Effects)
            ["No Explosions"] = true, -- Makes Explosion's invisible
            ["No Clothes"] = true, -- Removes Clothing from the game
            ["Low Water Graphics"] = true, -- Removes Water Quality
            ["No Shadows"] = true, -- Remove Shadows
            ["Low Rendering"] = true, -- Lower Rendering
            ["Low Quality Parts"] = true -- Lower quality parts
        }
        -- Load the FPS Booster script
        loadstring(game:HttpGet("https://raw.githubusercontent.com/CasperFlyModz/discord.gg-rips/main/FPSBooster.lua"))()
    end
})

UniversalTab:AddButton({
    Title = "Infinite Yield Reborn",
    Callback = function()
        loadstring(game:HttpGet("https://github.com/fuckusfm/infiniteyield-reborn/raw/master/source"))()
    end
})

UniversalTab:AddButton({
    Title = "B Genesis",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/raw-scriptpastebin/raw/main/B_Genesis'))()
    end
})

UniversalTab:AddButton({
    Title = "Fly V3",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/XNEOFF/FlyGuiV3/main/FlyGuiV3.txt"))()
    end
})

UniversalTab:AddButton({
    Title = "Free Gp",
    Callback = function()
loadstring(game:HttpGet("https://raw.githubusercontent.com/Imalwibest/Imalwibest/main/wynerdV2.lua",true))()
    end
})

UniversalTab:AddButton({
    Title = "Lazium Hub",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/CheapeeWastaken/Lazium/main/TheMain"))()
    end
})

UniversalTab:AddButton({
    Title = "NPC Hitbox Expander",
    Callback = function()
        loadstring(game:HttpGet("https://hastebin.skyra.pw/raw/zayajuquva"))()
    end
})

UniversalTab:AddButton({
    Title = "OP Fling",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/0Ben1/fe/main/obf_rf6iQURzu1fqrytcnLBAvW34C9N55kS9g9G3CKz086rC47M6632sEd4ZZYB0AYgV.lua.txt', true))()
    end
})

UniversalTab:AddButton({
    Title = "Simple Spy Mobile",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/REDzHUB/RS/main/SimpleSpyMobile"))()
    end
})

UniversalTab:AddButton({
    Title = "Universal Chat Tools",
    Callback = function()
        loadstring(game:HttpGet("https://rawscripts.net/raw/Universal-Script-Chat-Tools-7410"))()
    end
})

UniversalTab:AddButton({
    Title = "Keyboard",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/GGH52lan/GGH52lan/main/keyboard.txt"))()
    end
})

UniversalTab:AddButton({
    Title = "NukeVsCity",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/NukeVsCity/TheALLHACKLoader/main/NukeLoader", true))()
    end
})

UniversalTab:AddButton({
    Title = "Index Hub 300+ Scripts",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/IndexZHub/Loader/main/Loader"))()
    end
})

UniversalTab:AddButton({
    Title = "Mobile Dex",
    Callback = function()
        getgenv().Key = "Bash"
        loadstring(game:HttpGet("https://raw.githubusercontent.com/crceck123/roblox-script/main/MC_IY%20Dex.txt"))()
    end
})

UniversalTab:AddButton({
    Title = "VexHub",
    Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/V31nc/On-Discord/Created/VexHub"))()
    end
})

UniversalTab:AddButton({
    Title = "Universal Hub FE",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/Dvrknvss/UniversalFEScriptHub/main/Script'))()
    end
})

-- Westbound Tab
local WestboundTab = Tabs.Westbound
WestboundTab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Westbound'))()
    end
})

-- Weak Legacy 2 Tab
local WeakLegacy2Tab = Tabs.WeakLegacy2
WeakLegacy2Tab:AddButton({
    Title = "Hub",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/CanisLupusXL/CanislupusXHub/main/Weak_Legacy_2'))()
    end
})


-- Zombie Uprising Tab
local ZombieUprisingTab = Tabs.ZombieUprising
ZombieUprisingTab:AddButton({
    Title = "Unknown X",
    Callback = function()
        loadstring(game:HttpGet('https://raw.githubusercontent.com/Unknownproooolucky/Unknown-Hub-X-Universal-Games/main/Games/Zombie-Uprising'))()
    end
})

-- Save and Load Configurations
SaveManager:SetLibrary(Fluent)
InterfaceManager:SetLibrary(Fluent)

SaveManager:IgnoreThemeSettings()
SaveManager:SetIgnoreIndexes({})

InterfaceManager:SetFolder("FluentScriptHub")
SaveManager:SetFolder("FluentScriptHub/specific-game")

InterfaceManager:BuildInterfaceSection(Tabs.Settings)
SaveManager:BuildConfigSection(Tabs.Settings)

Window:SelectTab(1)

Fluent:Notify({
    Title = "Fluent",
    Content = "The script has been loaded.",
    Duration = 8
})

-- Load auto-config if available
SaveManager:LoadAutoloadConfig()
